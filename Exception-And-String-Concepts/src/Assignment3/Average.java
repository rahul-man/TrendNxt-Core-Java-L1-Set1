package Assignment3;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[5];
		float average = 0;
		int sum = 0;
		try {
			for (int i = 0; i < 5; i++) {
				array[i] = Integer.parseInt(args[i]);
				System.out.println("Number" + (i + 1) + ":" + array[i]);
				sum = sum + array[i];
			}
			average = sum / 5;
			System.out.println("Average of 5 numbers:" + average);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You have entered less than 5 numbers, Enter 5 numbers");
		}
	}
}
