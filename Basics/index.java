public class index{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,2,4,2,4};

        // int sum = 0;
        // for(int i=0;i<arr1.length;i++){
        //     sum = sum + arr1[i] + arr2[i];
        // }
        // System.out.println(sum);

        int[] arr3 = new int[arr1.length+arr2.length] ;
        int n = 0;
        for(int i=0;i<arr1.length;i++){
            arr3[i] = arr1[i];
            n++;
        }
        for(int i=0;i<arr2.length;i++){
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                arr3[n++] = arr2[i];
            }     
        }
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}