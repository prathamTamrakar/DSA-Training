public class unionAndIntersaction {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };
        int[] union = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            union[index] = arr1[i];
            index++;
        }
        for (int j = 0; j < arr2.length; j++) {
                boolean bool = false;
            for (int k = 0; k < arr2.length; k++) {
                if(arr1[k]==arr2[j]){
                    bool = true;
                }
                if(!bool){
                    union[index] = arr2[j];
                }
            }
        }
        for (int j = 0; j < union.length; j++) {
        System.out.println(union[j]);
        }
    }
}
