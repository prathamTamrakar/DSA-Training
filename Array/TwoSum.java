import java.util.Scanner;

public class TwoSum {

    static int[] TwoSumFn(int[] arr,int target){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            temp = target-arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==temp){
                    return new int[] {i,j};
                    // System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        return new int[]{};
    }jhhhjhjjhj    public static void main(String[] args) {
        int[] arr = {2,7,9,0,5};
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter target value");
		int target = sc.nextInt();
        int[] data = TwoSumFn(arr,target);
        for(int x: data){
            System.out.println(x);
        }
        // for(int i=0;i<arr.length;i++){
        //     temp = target-arr[i];
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]==temp){
        //             System.out.println(arr[i]+" "+arr[j]);
        //         }
        //     }
        // }


    }
}
