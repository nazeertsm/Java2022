package InterThreadCommunicationApp.in.ineuron.main;

class Demo extends Thread {
//data is updated
	int total = 0;

	public void run() {
//producer thread
		// sum of first 100 numbers
		for (int i = 1; i <= 100; i++) {
			total = total + i;
		}

	}

}

class Test {
	public static void main(String[] args) throws Exception {
		Demo d = new Demo();
		d.start();

		Thread.sleep(10);
		System.out.println(d.total);
		
	}
}
