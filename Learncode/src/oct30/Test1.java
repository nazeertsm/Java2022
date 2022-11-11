package oct30;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		List<Integer> nums1 = Arrays.asList(6, 5, 2, 8, 1, 7);
		int sum=0;
		
		for (int n : nums1) {

			if (n % 2 == 1) {
				n = n * 2;
				
				sum = sum+n;
				
			}
		}
		System.out.println(sum);

	}

}
