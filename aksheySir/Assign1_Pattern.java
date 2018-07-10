package aksheySir;

import java.util.Scanner;

public class Assign1_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		printup(a);
		printdwn(a);

	}

	private static void printup(int a) {
		for (int i=1;i<=a;i++){
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println("");
		}
	}

	private static void printdwn(int a) {
		for(int i=1;i<=a;i++){
			for (int j=1;j<=a-i;j++)
				System.out.print(j+" ");
			System.out.println("");
		}
		
	}

}
