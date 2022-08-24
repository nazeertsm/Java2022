package Aug13;

public class StringDemo6 {

	public static void main(String[] args) {

		// Allocates a new String from the given Character array
		char char_arr1[] = { 'A', 'p', 'p', 'l', 'e' };
		String s1 = new String(char_arr1); // Apple

		System.out.println(s1);

		// Allocates a String from a given character array but choose count characters
		// from the start_index.
		char char_arr2[] = { 'A', 'p', 'p', 'l', 'e' };
		String s2 = new String(char_arr2, 1, 3); // ppl
		System.out.println(s2);

		// Return the substring from the ith index character to end

		System.out.println(s1.substring(1));// apple
		
		
		String s3 = "Learn Share Learn  ";
		int op = s3.indexOf("Share"); // returns 6
		System.out.println(op);
		
		//Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
		String word1 = " Learn Share Learn ";
		String word2 = word1.trim(); // returns "Learn Share Learn"
		System.out.println(word2);
		
		 
		 Boolean out1 = "Apple".equals("Apple"); // returns true
		 Boolean out2 = "Apple".equals("aple"); // returns false
		 
		 System.out.println(out1);
		 System.out.println(out2);
	}
}