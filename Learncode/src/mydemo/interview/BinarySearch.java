package mydemo.interview;

public class BinarySearch {
	
	public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }             
        }
        return -1;
    }

	public static void main(String[] args) {
		
		int arr[] = {12, 23, 55, 66, 78};
		BinarySearch obj = new BinarySearch();
		int result = obj.search(arr, 66);
		System.out.println(result);

	}

}
