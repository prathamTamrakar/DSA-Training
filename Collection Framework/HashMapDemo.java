import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        
        HashMap<String,Integer>map = new HashMap<>();

        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("tree",3);

        System.out.println(map);
        System.out.println(map.get("one"));
        
        HashMap<Character,Integer> map2  = new HashMap<>();
        String input = "programminggggg";
        for(char ch:input.toCharArray()){
            if(ch != ' '){
                map2.put(ch,map2.getOrDefault(ch, 0)+1);
            }
        }
        System.out.println(map2);
    }
}
