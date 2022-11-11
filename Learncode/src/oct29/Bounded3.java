package oct29;

class Test<T extends Number> {
}

public class Bounded3 {

	public static void main(String[] args) {
		Test<Integer> t1 = new Test<Integer>();
		//Test<String> t2 = new Test<String>(); // CE
	}
}
