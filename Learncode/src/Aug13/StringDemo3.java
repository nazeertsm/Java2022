package Aug13;

public class StringDemo3 {

	public static void main(String[] args) {

		String s1 = "Apple";
		String s2 = "apple";
		String s3 = "Apple";

		System.out.println(s1.equalsIgnoreCase(s2)); // true
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.isEmpty()); // false

	}

}
