package nov06;

//Anonymous Inner Class that implements an interface
class InnerClassesDemo {
	public static void main(String[] args) {
		Runnable r = new Runnable() { // here we are not creating for Runnable interface are creating implements class
										// object.
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child thread");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}
}