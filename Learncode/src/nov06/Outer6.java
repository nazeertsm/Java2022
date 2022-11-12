package nov06;

class Outer6 {
	int x = 10;

	class Inner {
		int x = 100;

		public void m1() {
			int x = 1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer6.this.x);
		}
	}

	public static void main(String[] args) {
		new Outer6().new Inner().m1();
	}
}

/*
Output
======
javac Outer
java Outer
1000
100
10*/