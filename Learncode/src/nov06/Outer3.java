package nov06;
//Accessing inner class code from outside of outer class
class Outer3 {
	class Inner {
		public void m1() {
			System.out.println("inner class instance m1()");
		}
	}
}

class Test {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
	}
}

/*
Output
=====
javac Test
java Test
inner class instance m1()*/