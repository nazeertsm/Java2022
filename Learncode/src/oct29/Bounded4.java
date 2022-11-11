package oct29;

class Test2 <T extends Runnable>{}
public class Bounded4 {

	public static void main(String[] args) {
		
		Test2<Thread> t1 = new Test2<Thread>();
		//Test<String> t2 = new Test<String>(); //
	}
}
