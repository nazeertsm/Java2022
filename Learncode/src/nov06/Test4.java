package nov06;

class Test4 {
	int x = 10;
	static int y = 20;

	public void m1() {
		class Inner {
			public void m2() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner i = new Inner();
		i.m2();
	}

	public static void main(String[] args) {
		new Test4().m1();
	}
}

/*
Output
10
20*/