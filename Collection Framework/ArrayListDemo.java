import java.util.Collections;
import java.util.ArrayList;

class ArrayListDemo{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(2,11);
        arr.set(2,12);

        // for(int var : arr){
        //     System.out.println(var);
        // }

        // for(int i=0;i<arr.size();i++){
        //     System.out.println(arr.get(i));
        // }
        Collections.sort(arr);

        // for(int i=0;i<arr.size();i++){
        //     System.out.println(arr.get(i));
        // }

        int even = 0;
        int odd = 0;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)%2==0){
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(even+" "+odd);
        System.out.println(arr); // [5, 6, 12, 7]
        arr.remove(1);
        System.out.println(arr); // [5, 12, 7]
        System.out.println(arr.contains(10)); // false
        System.out.println(arr.contains(12)); // true
        int target = 7;
        System.out.println(arr.contains(target)); // true

    }
}

