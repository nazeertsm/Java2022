package Aug13;

public class StringDemo4 {

	public static void main(String[] args) {

		String s1 = "Apple";
		String s2 = "Banana";
		String s3 = "Orange";

		System.out.println(s1.length()); // 5
		System.out.println(s1.charAt(4)); // e , last character from Apple

		System.out.println(s1.substring(0, 4));// Appl

		System.out.println(s1.compareTo(s3)); // -14, compare each char, if result zero mens equal, negative s3 is
												// bigger
		// positive means s1 is bigger(Ascii compare)

	}

}
