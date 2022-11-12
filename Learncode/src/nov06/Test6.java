package nov06;

class Test6 {
	int i = 10;
	static int j = 20;

	public void m1() {
		int k = 30;
		final int l = 40;
		class Inner {
			public void m2() {
//line-1
			}
		}
		Inner i = new Inner();
		i.m2();
	}

	public static void main(String[] args) {
		new Test6().m1();
	}
}
