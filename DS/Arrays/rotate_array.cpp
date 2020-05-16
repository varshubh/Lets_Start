#include<iostream>
using namespace std;
int arr_rot (int *a, int diff){
		int arr[diff];
		for (int i=0;i<diff;i++)
			arr[i]=a[i];
		for(int i=0;i<10;i++)
			a[i]=a[i+diff];
		for(int i=0;i<diff;i++)
			a[10-diff+i]=arr[i];
		for(int i=0;i<10;i++)
			cout << a[i] <<"\t";
		return 0;
}
int one_by_one(int *a, int diff){
		int temp;
		for(int i=0;i<diff;i++)
		{
			temp=a[0];
			for (int i=0;i<10;i++)
				a[i]=a[i+1];
			a[9]=temp;
		}
		for(int i=0;i<10;i++)
			cout << a[i] <<"\t";
			return 0;
}
int gcd_calc(int a, int b){
	if (b == 0) 
      return a; 
   	return gcd_calc(b, a % b);
}
int juggle(int *a, int diff){
	int gcd, temp, sec;
	gcd=gcd_calc(10, diff);
	//cout<<gcd;
	for (int i=0;i<gcd;i++){
		temp=a[i];
		int j=i;
		while(1){
			int k=j+diff;
			if (k>=10)
				k=k-10;
			if(k==i)
				break;
			a[j]=a[k];
			j=k;
		}
		a[j]=temp;
	}
	for(int i=0;i<10;i++){
		cout<<a[i]<<"\t";
	}
}
int main()
{
	int a[10]={1,2,3,4,5,6,7,8,9,0};
	for(int i=0;i<10;i++)
		cout << a[i] <<"\t";
	cout << endl;
	int type, diff;
	cout << "Enter type : \n0. Using temp Arr\n1. One by One\n2.Juggling Algo"<<endl;
	cin >> type;
	cout << "Add Difference : ";
	cin>>diff;
	if (type==0)
		arr_rot(a, diff);
	if (type==1)
		one_by_one(a, diff);
	if (type==2)
		juggle(a, diff);
}
