public class searchInRoatedSortedArray {
    public static int search(int[] nums, int target) {
        int end = nums.length - 1;
        int start = 0;
        while (start <= end) {     
        int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] < nums[mid]) {
                if (nums[mid] > target && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid+1;
                }
            } else {
                if (nums[mid] < target && target <= nums[end]) {
                start = mid + 1;
                } else {
                    end = mid-1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        search(nums, target);

    }
}
