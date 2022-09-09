package staticexamples;

//Java program to Illustrate Calling of a Static Method

//Class 1
//Test2 class
class Test2 {

	static int x = 10;

	static {

		System.out.println("Static Block " + x);
	}

	// Static method
	public static int sum(int a, int b) {
		// Simply returning the sum
		System.out.println("static Method");
		return a + b;
	}
	
	
			
}

//Class 2
public class Launch8 {

	// Main driver method
	public static void main(String[] args) {
		// Custom values for integer
		// to be summed up
		int n = 3, m = 6;

		// Calling the static method of above class
		// and storing sum in integer variable
		int s = Test2.sum(n, m);

		// Print and display the sum
		System.out.println("sum is = " + s);

		int s2 = Test2.sum(7, 7);

		// Print and display the sum
		System.out.println("sum is = " + s2);
		
		System.out.println("sum is = " + s);
		
		
	}
}
