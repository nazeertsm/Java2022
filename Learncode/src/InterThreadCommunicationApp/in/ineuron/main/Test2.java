package InterThreadCommunicationApp.in.ineuron.main;
//updated pro Test

class Demo2 extends Thread {
//data is updated
	int total = 0;

	public void run() {
		//producer thread
		synchronized (this) {
			System.out.println("Child thread starts the calculation");// step-2
			//sum of first 100 numbers
			for (int i = 1; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("Child thread is giving the notifcation call");// step-3
			this.notify();
		}
	}
}

class Test2 {
	public static void main(String[] args) throws Exception {
		Demo2 d = new Demo2();
		d.start();
		//consumer thread
		synchronized (d) {
			System.out.println("Main Thread is calling wait()method....");// step-1
			d.wait();
			System.out.println("Main Thread got the notificationcall");// step-4
			System.out.println(d.total);// 5050
		}
	}
}