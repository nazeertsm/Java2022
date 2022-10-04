package MultiThreading;

class Test1 implements Runnable {

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

class Test2 implements Runnable {
	
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

class Test3 implements Runnable {

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

public class Launch4 {

	public static void main(String[] args)  {

		Test1 d1 = new Test1();
		Test2 d2 = new Test2();
		Test3 d3 = new Test3();
		Thread t1 =new Thread(d1);
		Thread t2 =new Thread(d2);
		Thread t3 =new Thread(d3);
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
