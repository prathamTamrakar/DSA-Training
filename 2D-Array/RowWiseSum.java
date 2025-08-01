public class RowWiseSum{
    public static void main(String[] args){
        int[][]arr = {{1,2,3},
                  {4,5,6},
                  {7,8,9}};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum = sum + arr[i][j];
                if(arr[i][j]==arr[i][2]){
                    System.out.println(sum);
                }
            }
            sum=0;
            
        }
    }
}