public class KadaneAlgo {
    public static int maxSubarray(int[] nums){
        int currSum = 0;
        int maxSum = nums[0];

        for(int num: nums){
            currSum = Math.max(num,currSum+num);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }

     public static int maxSubarray2(int[] nums){
        int currSum = 0;
        int maxSum = nums[0];

        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            maxSum = Math.max(maxSum,currSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, -1, 2, 1, -5, 4 };
        int result = maxSubarray(arr);
        System.out.println(result);
    }
}
