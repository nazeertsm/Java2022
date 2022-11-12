package nov06;

class Test5 {
	public void m1() {
		final int x = 10;
		class Inner {
			public void m2() {
				System.out.println(x);
			}
		}
		Inner i = new Inner();
		i.m2();
	}

	public static void main(String[] args) {
		new Test5().m1();
	}
}