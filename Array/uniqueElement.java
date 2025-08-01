
public class uniqueElement {
    public static void main(String[] args) {
       int[] arr1 = {1,2,3,4};
       int[] arr2 = {2,8,7,4};
        int[] arr3 = new int[arr1.length];
        // System.out.println(arr1.length);
        int n = 0;
        for(int i=0;i<arr1.length;i++){
            boolean bool = false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    break;
                }
                bool = true;
            }
            if(bool){
                arr3[n] = arr1[i];
                n++;
            } 
        }
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}