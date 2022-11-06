package mydemo.interview;

public class ReverseInteger {

	
		public int reverse(int x) {
			int reversed = 0;

			int min = Integer.MIN_VALUE;
			int max = Integer.MAX_VALUE;
			while (x != 0) {
				int lastdegit = x % 10;
				if (reversed > max / 10 || (reversed == max / 10 && lastdegit > 7))
					return 0;

				if (reversed < min / 10 || (reversed == min / 10 && lastdegit < -8))

					return 0;

				reversed = reversed * 10 + lastdegit;
				x = x / 10;

			}

			return reversed;

		}
	

	public static void main(String[] args) {
		
		ReverseInteger rev = new ReverseInteger();
		
		int rev_int= rev.reverse(-123);
		
		System.out.println(rev_int);

	}

}
