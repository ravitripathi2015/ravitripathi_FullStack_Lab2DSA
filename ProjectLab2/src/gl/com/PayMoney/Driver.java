package gl.com.PayMoney;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Transaction array size for PayMoney: ");
		int size = scan.nextInt();
		if (size <= 0) {
			System.out.println("Enter Valid Input");
			size = scan.nextInt();
		}
		System.out.println("Enter Transaction values done by PayMoney: ");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter Daily Number of Transaction- Target to be Achieved:");
		int target = scan.nextInt();
		int tval = 0;
		for (int i = 0; i < target; i++) {
			System.out.println("Enter Target Amount for PayMoney:");
			tval = scan.nextInt();
			int sum = 0;
			int counter = 0;
			for (int j = 0; j < arr.length; j++) {
				sum = sum + arr[j];
				counter = counter + 1;
				if (sum >= tval) {
					break;
				}
			}
			if (tval > sum) {
				System.out.println("Target " + tval + " can't be achieved");
				continue;
			} else
				System.out.println("Target " + tval + " is achieved after " + counter + " Transactions");
		}
		scan.close();
	}
}
