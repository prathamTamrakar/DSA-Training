public class SlidingWindow {

    public static int problem(int[] nums,int size){
        int maxSum = Integer.MIN_VALUE;
        int windomSum = 0;
        int k = 3;
        for(int i=0;i<k;i++){
            windomSum+=nums[i];
        }
        for(int i=k;i<nums.length;i++){
            windomSum+=nums[i]-nums[i-k];
            maxSum = Math.max(maxSum, windomSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, -1, 2, 1, -5, 4 };
        int result = problem(arr,3);
        System.out.println(result);
    }
}
