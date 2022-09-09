package staticexamples;

public class RLaunch2 {
	
	static String name = "Apple";
	/*every instance(this example has 3) name is same, instead of, we can use static, so one copy only created
 -> if the value instance variable , does not change object to object, the make such variable as static*/
	

	public static void main(String[] args) {
		
		RLaunch2 R1 = new RLaunch2();
		RLaunch2 R2 = new RLaunch2();
		RLaunch2 R3 = new RLaunch2();
	

	}

}
