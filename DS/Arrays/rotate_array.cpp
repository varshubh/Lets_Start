#include<iostream>
using namespace std;
int main()
{
	int a[10]={1,2,3,4,5,6,7,8,9,0};
	for(int i=0;i<10;i++)
		cout << a[i] <<"\t";
	cout << endl;
	int type;
	cout << "Enter type : \n0. Using temp Arr\n1. One by One"<<endl;
	int diff;
	cin >> type;
	if (type==0)
	{
		cout << "Add Difference : ";
		cin>>diff;
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
	if (type==1)
	{
		cout << "Add Difference : ";
		cin>>diff;
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
}
