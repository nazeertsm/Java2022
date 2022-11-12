package nov06;


//=>From inner class we can access all members of outer class (both static and nonstatic,
//private and non private methods and variables) directly
class Outer4 {
	int x = 10;
	static int y = 20;

	class Inner {
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		new Outer4().new Inner().m1();
	}
}

/*
javac Outer
java Outer
10
20*/