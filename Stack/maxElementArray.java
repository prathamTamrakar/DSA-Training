import java.util.Stack;

public class maxElementArray {
    public static void main(String[] args) {
        int[] arr = {8,1,0,3,0,7};
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        // for (int i = 0; i < arr.length; i++) {
        //     int max = arr[i];
        //     for (int j = i+1; j < result.length; j++) {
        //         if(arr[i]<arr[j]){
        //             max = arr[j];
        //             break;
        //         }
        //     }
        //     if(max==arr[i]){
        //         result[i] = -1;
        //     }else{
        //         result[i] = max;
        //     }
        // }

        for(int i= arr.length-1;i>=0;i--){
            while (! stack.isEmpty() && stack.peek()<=arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty()?(-1):stack.peek();
            stack.push(arr[i]);
        }




        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
