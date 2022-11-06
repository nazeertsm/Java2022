package mydemo.interview;

public class ReverseString {

	public char[] reverseString(char[] s) {
		int len = s.length;
		int left = 0;
		int right = s.length - 1;
		while (left < right) {
			char tmp = s[left];
			s[left] = s[right];
			s[right] = tmp;
			left++;
			right--;
		}
		return s;

	}

	public static void main(String[] args) {

		char[] JavaCharArray = { 'a', 'b', 'c', 'd', 'e' };
		ReverseString ob = new ReverseString();
		char[] revCharArray = ob.reverseString(JavaCharArray);

		for (char c : revCharArray) {
			System.out.print(c);
		}

	}

}
