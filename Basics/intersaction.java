public class intersaction{
     public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,2,4,2,4};
        int[] arr3 = new int[Math.min(arr1.length, arr2.length)];
        int n = 0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[i]==arr2[j]){
                    arr3[n] = arr1[i] ;  
                    n++;
                    break;   
                }
            }
        }
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);

        }
     }
}