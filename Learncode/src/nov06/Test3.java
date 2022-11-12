package nov06;

class Test3 {
	public void m1() {
		class Inner {
			public void sum(int x, int y) {
				System.out.println("The sum is ::" + (x + y));
			}
		}
		new Inner().sum(10, 20);
		;
		;
		;
		;
		new Inner().sum(100, 200);
		;
		;
		;
		;
		new Inner().sum(1, 2);
	}

	public static void main(String[] args) {
		new Test3().m1();
	}
}

/*
javac Outer
java Outer
The sum is :: 30
The sum is :: 300
The sum is :: 3 */