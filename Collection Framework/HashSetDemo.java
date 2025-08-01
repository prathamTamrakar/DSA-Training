
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("hello");
        set.add("hello");
        set.add("hiii");

        System.out.println(set);
    }
}
