package Assignment1;

public class PersonAge {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		if (age <=18 || age >= 60)
			throw new InvalidAgeException();
		else
			System.out.println("Name:" + name + ",Age:" + age);
	}

}
