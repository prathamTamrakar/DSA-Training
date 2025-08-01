public class countEvenNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 9 };
        int k = 3;

        // for (int i = 0; i <= arr.length - k; i++) {
        // int count = 0;
        // for (int j = i; j < i + k; j++) {
        // if (arr[j] % 2 == 0) {
        // count++;
        // }
        // }
        // System.out.println(count);
        // }

        // Sliding window Algorihtms
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = k; i < arr.length; i++) {
            if (arr[i - k] % 2 == 0) {
                count--;
            }
            if (arr[i] % 2 == 0) {
                count++;
            }
            System.out.println(count);
        }
    }
}
