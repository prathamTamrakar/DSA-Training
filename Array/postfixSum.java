public class postfixSum {
    public static void main(String[] args) {
        int[] input = {2,4,6,8,10};
        int[] output = new int[input.length];
        for(int i=input.length-1;i<=0;i--){
            if(i==input.length-1){
                output[i] = input[i];
            } else {
                output[i] = input[i] + input[i+1];
            }
        }
        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }
    }
}
