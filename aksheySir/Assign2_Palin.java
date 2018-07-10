package aksheySir;

import java.util.Scanner;

public class Assign2_Palin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		boolean a = check(str);
		if(a)
			System.out.println("Possible");
		else
			System.out.println("Not Possible");
	}

	private static boolean check(String str) {
		int a[]=getArr(str);
		int c= palinCheck(a);
		if(c==1||c==0)
			return true;
		return false;
	}

	private static int palinCheck(int[] a) {
		int c=0;
		for(int i=0;i<26;i++){
			if(a[i]%2==0)
				continue;
			else
				c++;
		}
		return c;
	}

	private static int[] getArr(String str) {
		int a[]=new int[26];
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='A' && str.charAt(i)<= 'Z')
				a[str.charAt(i)-'A']++;
			if(str.charAt(i)>='a' && str.charAt(i)<= 'z')
				a[str.charAt(i)-'a']++;
		}
		return a;
	}

}
