package sep24;

/* 3.parseXXX()
Every wrapper class except Character class Contains parseXXXX() to convert String to Corresponding primtive type.
signature: public static xxxx parseXXX(String data)
*/
public class StringToPrimitive {

	public static void main(String[] args) {

		int i1 = Integer.parseInt("10");
		System.out.println(i1);// 10
		boolean b1 = Boolean.parseBoolean("TrUE");
		System.out.println(b1);// true
		//short s1 = Short.parseShort("Ten");
		//System.out.println(s1);// NumberFormatException
		double d = Double.parseDouble("12");
		System.out.println(d);// 12.0
		
		
		// parses the string argument
	      int a = Integer.parseInt("5");
	      int b = Integer.parseInt("3");
	      int c = Integer.parseInt("2");

	      int m = a * b * c;
	      System.out.print("Value after multiplying = " + m); //30

	}

}
