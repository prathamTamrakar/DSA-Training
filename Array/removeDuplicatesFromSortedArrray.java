public class removeDuplicatesFromSortedArrray {
    public static void main(String[] args) {
        int[] nums = { 0,0,1,1,1,2,2,3,3,4 };
    //     int count = 0;
    //     int start = 1;
    //     int end = nums.length;
    //     // if (end == 1) {
    //     //     return 1;
    //     // }
    //     for (int i = 1; i < nums.length; i++) {
    //         int index = i;
    //         if (nums[i] == nums[i - 1]) {
    //             int temp = nums[i];
    //             for(int j=i+1;j<end;j++){
    //                 nums[j-1] = nums[j];
    //             }
    //             nums[end-1] = temp;
    //             end--;
    //         } else {
    //             count++;
    //         }
    //         i = index-1;
    //     }
    //    System.out.println(count);

    //    for(int i=0;i<nums.length;i++){
    //     System.out.print(nums[i]+" ");
    //    }

        int n = nums.length;
        int it = 1;
        
        for(int i=0;i<n;i++){
            if(nums[i] != nums[i-1]){
                nums[it++] = nums[i];
            }
        }
    }
}
