package Assignment2;

public class Student {

	public static void main(String[] args) throws NumberFormatException {
		// TODO Auto-generated method stub

		for (int i = 0; i < 2; i++) {
			String name = args[0];
			int sub1 = Integer.parseInt(args[1]);
			int sub2 = Integer.parseInt(args[2]);
			int sub3 = Integer.parseInt(args[3]);

			if (sub1 < 0 || sub1 > 100)
				throw new NumberFormatException();
			if (sub2 < 0 || sub2 > 100)
				throw new NumberFormatException();
			if (sub3 < 0 || sub3 > 100)
				throw new NumberFormatException();
			else
				System.out.println("Name:" + name);
				System.out.println("Marks of Subject1:" + sub1);
				System.out.println("Marks of Subject2:" + sub2);
				System.out.println("Marks of Subject3:" + sub3);
			}

	}

}
