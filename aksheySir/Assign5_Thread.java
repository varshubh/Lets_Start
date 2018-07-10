package aksheySir;

import java.util.Scanner;

class MyThread implements Runnable{
 
	public int n;
	static int  num=1;
	int rem;
	static Object lock=new Object();
 
	MyThread(int rem,int n)
	{
		this.rem=rem;
		this.n=n;
	}
 
	public void run() {
		while (n>num) {
			 synchronized (lock) {
				while (num%2!=rem) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();					}
				}
				String str;
				if (rem==1)
					str = "Thread 1";
				else
					str = "Thread 2";
				System.out.println(str+"  :\t" + num);
				num++;
				lock.notifyAll();
			}
		}
	}
}
public class Assign5_Thread {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		sc.close();
 
		Thread odd=new Thread(new MyThread(1,n));
		Thread even=new Thread(new MyThread (0,n));
		
		odd.start();
		even.start();
 
	}
}

