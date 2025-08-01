public class pallindrome {
    static boolean pd(String s,int i,int j){
        // if(i<j){
        //     if(s.charAt(i)==s.charAt(j)){
        //         pd(s, ++i, --j);
        //         return true;
        //     }
        // }
        // return false;
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }

        return pd(s, ++i, --j);
    }

    public static void main(String[] args) {
        String s = "AABCSBAA";
        System.out.println(pd(s, 0, s.length() - 1));
    }
}
