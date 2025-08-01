import java.util.HashMap;
import java.util.HashSet;

public class longestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                maxLen = Math.max(maxLen, set.size());
                set.clear();
                i--;
            } else {
                set.add(s.charAt(i));
            }
            maxLen = Math.max(maxLen, set.size());

        }
        return maxLen;
    }

    public static int LongestSubstring(String s) {
        int maxLen = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            while (set.contains(ch)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static int LongestSubString(String s) {
        int maxLen = 0;
        int i = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                i = Math.max(i,map.get(ch)+1 );
            }
                map.put(ch,j);
                maxLen = Math.max(maxLen, j-i+1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcdeffrsdgjkgfgsggjabcbb";
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (set.contains(ch)) {
                    break;
                } else {
                    set.add(ch);
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        System.out.println(maxLen);
        System.out.println(lengthOfLongestSubstring(s));
    }

}