package oct30.anonyms;

import java.util.*;

public class Demo4 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(5, 7, 2, 9);
		System.out.println(nums);
		Collections.sort(nums, (n1, n2)->n2-n1);
		System.out.println(nums);

	}

}
