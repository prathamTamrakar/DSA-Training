public class maxSubArray {
    public static int maxSubArray1(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i <= nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    // we have size by the user how much element pair should
    public static int maxSubArray2(int[] nums,int size) {
        int maxSum = Integer.MIN_VALUE;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length-size; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                sum = sum + nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    // public static int maxSubArray3(int[] nums) {
    //     int maxSum = Integer.MIN_VALUE;
    //     if (nums.length == 1) {
    //         return nums[0];
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         MaxSum += nums[i];
    //     }
    //     return maxSum;
    // }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, -1, 2, 1, -5, 4 };
        int result = maxSubArray2(arr,3);
        System.out.println(result);
    }
}
