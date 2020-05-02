package Assignment5;

import java.util.Scanner;

public class sumOfDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0, rem = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 digit number:");
		int n = sc.nextInt();
		while (n != 0) {
			rem = n % 10;
			n = n / 10;
			sum = sum + rem;
		}
		System.out.println("The sum of digit is:" + sum);
		sc.close();
	}
}
