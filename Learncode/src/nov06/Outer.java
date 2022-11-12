package nov06;

//Accessing inner class code from static area of outer class:

class Outer {
	class Inner {
		public void m1() {
			System.out.println("inner class instance m1()");
		}
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
	}
}

/*
 * Output ===== javac Outer java Outer inner class instance m1()
 */