package nov06;

class Outer5 {
	int x = 10; //instance variable of outer class

	class Inner {
		int y = 100;//instance variable of inner class

		public void m1() {
			int z = 1000; //local variable of inner class method
			System.out.println(x);  //10
			System.out.println(y); //100
			;
			System.out.println(z); //1000
		}
	}

	public static void main(String[] args) {
		new Outer5().new Inner().m1();
	}
}