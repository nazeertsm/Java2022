package sep24;

public class WrappertoPrimitive {

	public static void main(String[] args) {
		
		// Converting Integer to int(Wrapper to Primitive)

		Integer a = new Integer(3);
		int m = a.intValue();// converting Integer to int explicitly
		int n = a;// unboxing, now compiler will write a.intValue() internally

		System.out.println(a + " " + m + " " + n);
		
		
		Integer i=new Integer(130);
		System.out.println(i.byteValue());//-126
		System.out.println(i.shortValue());//130
		System.out.println(i.intValue());//130
		System.out.println(i.longValue());//130
		System.out.println(i.floatValue());//130.0
		System.out.println(i.doubleValue());//130.0
		System.out.println("*************");
				
		Character c1=new Character('c');
		char c2= c1.charValue();
		System.out.println(c2);//c
		
		Boolean b1=new Boolean("nitin");
		Boolean b2=b1.booleanValue();
		System.out.println(b2);//false

	}

}

/*
Note: 130 is not in the range of byte so jvm will perform operation in the
following manner
range = -128 to 127
result = -128,-127,-126
last value will be stored.

*
*
		*2.xxxxValue()
		We can use xxxxValue() to convert wrapper to prmitive type.
		Every Number type wrapper class(Byte,Short,Integer,Long,Float,Double)
		contains the
		following 6 xxxxValue() method to convert the wrapper object to primitive
		type.
		
	Number
		Byte
		Short
		Integer
		Long
		Float
		Double
		Character
		Boolean
*
*/

