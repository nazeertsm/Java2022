package MultiThreading;

class MTest1 implements Runnable {

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

class MTest2 implements Runnable {
	
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

class MTest3 implements Runnable {

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

public class Launch5 {

	public static void main(String[] args) throws Exception  {
		
		System.out.println("Main thread got chance first");
		
		Thread t = Thread.currentThread();
		System.out.println(t.isAlive());

		MTest1 d1 = new MTest1();
		MTest2 d2 = new MTest2();
		MTest3 d3 = new MTest3();
		
				
		Thread t1 =new Thread(d1);
		Thread t2 =new Thread(d2);
		Thread t3 =new Thread(d3);
		
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		
		t1.start();
		System.out.println(t1.isAlive());
		
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Main thread complete first");
		
		

	}

}
