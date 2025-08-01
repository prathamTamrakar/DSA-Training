import java.util.HashMap;
import java.util.Scanner;

public class TwoSumAnother{

    public static int[] TwoSumFn(int[] nums,int target){
        int temp = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            temp = target-nums[i];
            if(map.containsKey(temp)){
                return new int[] {map.get(temp),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,9,0,5};
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter target value");
		int target = sc.nextInt();
        int[] data = TwoSumFn(nums,target);
        for(int x: data){
            System.out.println(x);
        }
        
    }
}

