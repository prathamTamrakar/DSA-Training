import java.util.ArrayList;

public class mergeSort {

    static void merge(int[] arr, int s, int mid, int e) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = s;
        int j = mid + 1;
        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
            } else {
                temp.add(arr[j]);
                i++;
            }
        }
        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }
        while (j <= e) {
            temp.add(arr[j]);
            j++;
        }
        for (int k = 0; k < temp.size(); k++) {
            arr[s+k]=temp.get(k);
        }
    }

    static void divide(int[] arr, int s, int e) {
        for (int i = s; i <= e; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("index " + s + " " + e);
        System.out.println("----------------------");

        if (s < e) {
            int mid = (s + e) / 2;

            divide(arr, s, mid);
            divide(arr, mid + 1, e);
            // merge(arr, s, mid, e);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 7, 5, 1, 2, 6 };
        divide(arr, 0, arr.length - 1);
        for(int x : arr){
            System.out.println(x);
        }
    }
}
