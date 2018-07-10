package hotelPattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Hotel lakeWood = new Woods(new Cost(110, 90),new Cost(80, 80),3);
		Hotel bridgeWood = new Woods(new Cost(160, 60),new Cost(110,50), 4);
		Hotel ridgeWood = new Woods(new Cost(220, 50),new Cost(100, 40), 5);
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter Type of Costumer :\n1. Regular \n2. Rewarded");
		String s = sc.nextLine();
		System.out
				.println("Enter the series of dates in dd/mm/yyyy format seperated by spaces :\n");
		String date = sc.nextLine();
		sc.close();
		String str[] = date.split(" ");
		int arr[] = Utility.getWeWd(str);

		int billLW = lakeWood.calculateBill(arr[0], arr[1], s);
		int billBW = bridgeWood.calculateBill(arr[0], arr[1], s);
		int billRW = ridgeWood.calculateBill(arr[0], arr[1], s);
		if (billLW < billBW && billLW < billRW) {
			System.out
					.println("Minimum bill created by : Hotel Lake Wood : bill :"
							+ billLW + " : rating :" + lakeWood.rating);
		} else if (billBW < billLW && billBW < billRW) {
			System.out
					.println("Minimum bill created by : Hotel Bridge Wood : bill :"
							+ billBW + " : rating :" + bridgeWood.rating);
		} else if (billRW < billBW && billRW < billLW) {
			System.out
					.println("Minimum bill created by : Hotel Ridge Wood : bill :"
							+ billRW + " : rating :" + ridgeWood.rating);
		}

	}

}
