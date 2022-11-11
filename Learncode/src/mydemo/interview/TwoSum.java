package mydemo.interview;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			} else {
				map.put(nums[i], i);
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {

		int[] arr = { 2, 7, 11, 15 };

		int[] x = twoSum(arr, 13);
		for (int result : x)
			System.out.print(result + " ");
	}

}
