package Assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		Thread thread = new Thread(t);
		thread.start();

	}
}

class test implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i <=10; i++) {
				Thread.sleep(2000);
				Date d = new Date();
				SimpleDateFormat simpDate = new SimpleDateFormat("hh:mm:ss");
				System.out.println("Current Time:"+simpDate.format(d));
				// System.out.println(new Date());
			}
		} catch (InterruptedException e) {
			System.out.println("Exception..." + e);
		}
	}
}
