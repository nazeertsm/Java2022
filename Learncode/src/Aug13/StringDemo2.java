package Aug13;

public class StringDemo2 {

	public static void main(String[] args) {
		

		String s1 = "Apple";
		String s2 = "Apple";
		String s3 = "Apple";
		if (s1 == s2) { // comparing reference , not string

			System.out.println("s1 and s2 references are same: ");
		} else {
			System.out.println("s1 and s2 references are not same: ");
		}

		if (s1.equals(s3)) { // comparing string , not reference

			System.out.println("s1 and s2 strings are same: ");
		} else {
			System.out.println("s1 and s2 strings are not same: ");
		}

	}

}
