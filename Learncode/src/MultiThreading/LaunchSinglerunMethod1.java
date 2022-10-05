package MultiThreading;

class SAlpha extends Thread {
	public void run() {

		String t = Thread.currentThread().getName();

		if (t.equals("BANK")) {
			
			banking();
			
		} else if (t.equals("PRINT")) {

			Printing();
		}

		else {

			calculation();
		}

	}

	public void banking() {

		System.out.println("Banking task started: ");

		for (int i = 0; i < 3; i++) {
			try {

				Thread.sleep(2000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			System.out.println("Banking......");

		}

		System.out.println("Banking task completed..");
	}

	public void Printing() {

		System.out.println("Printing activity: ");

		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			System.out.println("Printing......");

		}

		System.out.println("Printing completed..");

	}

	public void calculation() {

		System.out.println("calculation task started: ");

		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			System.out.println("some calculation......");

		}

		System.out.println("calculation task completed..");

	}

}

public class LaunchSinglerunMethod1 {

	public static void main(String[] args) {

		SAlpha a1 = new SAlpha();
		SAlpha a2 = new SAlpha();
		SAlpha a3 = new SAlpha();

		a1.setName("BANK");
		a2.setName("PRINT");
		a3.setName("CALC");
		a1.start();
		a2.start();
		a3.start();

	}

}
