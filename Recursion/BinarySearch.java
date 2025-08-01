public class BinarySearch {
    public static int ispresent(int[] arr,int n, int start,int end){
        int mid = (start+end)/2;
        if(arr[mid]==n){
            return mid;
        } else if (arr[mid]>n) {
            return ispresent(arr, n, start, mid-1);
        } else {
            return ispresent(arr, n, mid+1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(ispresent(arr, 1, 0,arr.length-1));
    }
}
