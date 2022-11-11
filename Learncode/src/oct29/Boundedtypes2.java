package oct29;

public class Boundedtypes2 {

	class Test<T extends Number> {
	}

	class Demo {
		public static void main(String[] args) {
			//Test<Integer> t1 = new Test<Integer>();
			//Test<String> t2 = new Test<String>(); // CE
		}
	}

	public static void main(String[] args) {

	}

}

/*
 * Bounded types Example 2: class Test<T extends X> {} If x is a class then as
 * the type parameter we can pass either x or its child classes. If x is an
 * interface then as the type parameter we can pass either x or its
 * implementation classes..
 */