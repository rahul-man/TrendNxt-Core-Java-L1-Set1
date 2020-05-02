package Assignment1;

public class Assignment1 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			int n = (int) (Math.random() * 10);

			Random r = new Random(n);
			Thread t1 = new Thread(r);

			factorial f = new factorial(n);
			Thread t2 = new Thread(f);

			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			t2.start();
			try {
				t2.join();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class Random implements Runnable {

	private int n;

	public Random(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		System.out.println("Number: " + n);

	}

}

class factorial implements Runnable {

	private int n;

	public factorial(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		int fact = 1;
		if (n == 0) {
			System.out.println("Factorial of " + n + ": " + 1);
		} else {
			for (int j = 1; j <= n; j++) {
				fact = fact * j;
			}
			System.out.println("Factorial of " + n + ": " + fact);
		}
	}
}
