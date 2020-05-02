package Assignment4;

import java.util.Scanner;

public class pallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int n=str.length();
		for(int i=0;i<n/2;i++) {
			if(str.charAt(i)!=str.charAt(n-i-1)) {
				System.out.println("Not Pallindrome");
				System.exit(0);
			}
		}
		System.out.println("Pallindrome");
		sc.close();
	}
}
