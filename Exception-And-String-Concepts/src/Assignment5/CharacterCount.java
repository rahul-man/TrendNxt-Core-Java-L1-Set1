package Assignment5;

import java.util.Scanner;

public class CharacterCount {
	public int characterCount(String str, char ch) {
		return str.length() - str.replaceAll(String.valueOf(ch), "").length();
		// return str.replaceAll(String.valueOf(ch), "").length();
	}

	public static void main(String[] args) {

		CharacterCount cc = new CharacterCount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the string:");
		String s = sc.nextLine();
		s = s.toLowerCase();
		System.out.println("Enter the char to count:");
		char c = sc.next().charAt(0);
		System.out.println("No of occurences of " + c + ":" + cc.characterCount(s, c));
		sc.close();
	}
}
