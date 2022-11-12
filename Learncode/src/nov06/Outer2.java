package nov06;

//Accessing inner class code from instance area of outer class
class Outer2 {
	class Inner {
		public void m1() {
			System.out.println("inner class instance m1()");
		}
	}

	public void m2() {
		Inner i = new Inner();
		i.m1();
	}

	public static void main(String[] args) {
		Outer2 o = new Outer2();
		o.m2();
	}
}
/*
 * javac Outer
 *  java Outer
 *   inner class instance m1()
 */