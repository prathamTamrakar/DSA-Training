public class prefixSum {
    public static void main(String[] args) {
        int[] input = {2,4,6,8,10};
        int[] output = new int[input.length];

        // int sum = 0;
        // for(int i=0;i<input.length;i++){
        //     if(i==0){
        //         output[i] = input[i];
        //         sum = output[i];
        //     } else {
        //         sum+=input[i];
        //         output[i] = sum;
        //     }
        // }

        output[0] = input[0];
        for(int i=1;i<input.length;i++){
           output[i] = input[i-1]+input[i];
        }

        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }
    }
}
