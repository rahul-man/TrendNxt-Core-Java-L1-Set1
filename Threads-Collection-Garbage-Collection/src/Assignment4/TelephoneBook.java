package Assignment4;

import java.util.HashMap;
import java.util.Scanner;

public class TelephoneBook {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("Rahul", "123456789");
		map.put("Shubha", "987654321");
		map.put("John", "999888444");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name=sc.nextLine();
		
		if(map.containsKey(name)) {
			System.out.println(name+"="+map.get(name));
		}
		sc.close();

	}

}
