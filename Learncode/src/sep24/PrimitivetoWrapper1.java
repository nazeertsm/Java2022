package sep24;
/*
Usage of Wrapper class
---------------------------
utility method(helper methods/static methods)
1.valueOf()
2.XXXXValue()
3.parseXXX()
4.toString()
 */

public class PrimitivetoWrapper1 {

	public static void main(String[] args) {

		// Converting int into Integer
		int a = 20;
		////usage of utility methods to create Wrapper Objet
		Integer i = Integer.valueOf(a);// converting int into Integer explicitly
		Integer j = a; // autoboxing, now compiler will write Integer.valueOf(a) internally

		System.out.println(a + " " + i + " " + j);
		
		
		
		//constructor usage of Wrapper class to create Wrapper Object
		Integer i1= new Integer(10);
		Integer i2= new Integer("10");
		
		
		//usage of utility methods to create Wrapper Objet
		Integer i3= Integer.valueOf(10);
		Integer i4= Integer.valueOf("10");
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println();
		
		System.out.println(i3);
		System.out.println(i4);
		//Note: valueOf() is also a part of Character class.
	}
}