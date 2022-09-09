package staticexamples;

class Test {

	// static variable
	static int a = m1();

	// static block
	static {
		System.out.println("Inside static block");
	}

	// static method
	static int m1() {
		System.out.println("from m1");
		
		return 20;
	}

}

public class Launch6 {

	public static void main(String[] args) {

		System.out.println(Test.m1());

	}

}
