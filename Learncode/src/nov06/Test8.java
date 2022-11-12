package nov06;

class PopCorn2 {
	public void taste() {
		System.out.println("spicy");
	}
}

class Test8 {
	public static void main(String[] args) {
		PopCorn2 p = new PopCorn2() {
			public void taste() {
				methodOne();// valid call(internal purpose)
				System.out.println("salty");
			}

			public void methodOne() {
				System.out.println("child specific method");
			}
		};
//p.methodOne();//here we can not call(outside inner class)
		p.taste();// salty
		PopCorn2 p1 = new PopCorn2();
		p1.taste();// spicy
	}
}

/*
Output:
Child specific method
Salty
Spicy*/