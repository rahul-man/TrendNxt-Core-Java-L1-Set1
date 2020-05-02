package Assignment5;

import java.util.HashSet;
import java.util.Iterator;

public class Employee {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("Rahul");
		set.add("Shubha");
		set.add("Amit");
		set.add("Sam");

		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
