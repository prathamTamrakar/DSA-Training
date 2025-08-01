import java.util.Arrays;

public class MergeTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeArr = new int[nums1.length + nums2.length];
        int i = 0;
        for (int x : nums1) {
            mergeArr[i++] = x;
        }
        for (int x : nums2) {
            mergeArr[i++] = x;
        }
        Arrays.sort(mergeArr);
        for(int x: mergeArr){
            System.out.println(x);
        }
        int n = mergeArr.length;
        if(n%2==0){
            // int index = mergeArr.length/2;
            // double median = (mergeArr[index]+mergeArr[index+1])/2;
            // return median;
            return (mergeArr[n/2]+mergeArr[n/2-1])/2;
        } else {
            // int index = mergeArr.length/2;
            // double median = mergeArr[index/2];
            // return median;
            return mergeArr[n/2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 7, 8 };
        int[] nums2 = { 2, 4, 5, 6 };
        findMedianSortedArrays(nums1,nums2);
    }
}
