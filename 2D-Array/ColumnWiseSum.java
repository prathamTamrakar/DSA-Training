public class ColumnWiseSum{
    public static void main(String[] args){
        int[][]arr = {{1,2,3},
                  {4,5,6},
                  {7,8,9}};
        // int sum1 = 0;
        // int sum2 = 0;
        // int sum3 = 0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         if(arr[i][j]==arr[i][0]){
        //             sum1+=arr[i][j];
        //         } else if (arr[i][j]==arr[i][1]){
        //             sum2+=arr[i][j];
        //         } else {
        //             sum3+=arr[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum1+" "+sum2+" "+sum3);

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum = sum + arr[j][i];
                if(arr[j][i]==arr[2][i]){
                    System.out.println(sum);
                }
            }
            sum=0;
        }
    }
}