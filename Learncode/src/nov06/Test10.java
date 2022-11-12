package nov06;

class Test10 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("child thread");
				}
			}
		}).start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}
/*
Output:
=> This output belongs to example 2, anonymous inner class that implements an
interface example and anonymous inner class that define inside method
arguments example.
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Child thread
Child thread
Child thread
Child thread
Child thread
Child thread
Child thread
Child thread
Child thread
Child thread*/

/**/