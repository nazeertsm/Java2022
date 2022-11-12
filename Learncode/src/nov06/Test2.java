package nov06;

class A {
	class B {
		class C {
			public void m1() {
				System.out.println("C class method");
			}
		}
	}
}

class Test2 {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.m1();
	}
}

/*
javac Test
java Test
C class method
Note:
new A().new B().new C().m1();*/


/*
Nesting of Inner classes :
We can declare an inner class inside another inner class*/