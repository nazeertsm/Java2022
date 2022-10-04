package MultiThreading;

class Demo1 extends Thread {

	public void run() {

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

}

class Demo2 extends Thread {
	
	public void run() {
	
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

}

class Demo3 extends Thread {

	public void run() {
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

public class Launch3 {

	public static void main(String[] args) throws Exception {

		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		d1.start();
		d2.start();
		d3.start();
		

	}

}
