package sep24;

/*4. toString()
We can use toString() to convert wrapper object/primitve data to
String.
signature: public static String toString(XXXX data)
public static String toString(xxxx data)*/

public class Wrapper_object_primitve_data_to_String {

	public static void main(String[] args) {

		Integer i = Integer.valueOf("10");
		System.out.println(i);// 10(in String format)
		System.out.println(i.toString());// 10(in String format)
		
		System.out.println();
		String s1 = Integer.toString(10);
		String s2 = Boolean.toString(true);
		String s3 = Character.toString('a');
		System.out.println(s1);// 10(in string format)
		System.out.println(s2);// true(in string format)
		System.out.println(s3);// a(in string format)

	}

}
