public class validParenthesis {
    public static boolean isValid(String s) {
        char[] arr = new char[s.length()];
        int top = -1;
        if (s.length() == 1) {
            return false;
        }
        boolean bool = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                arr[++top] = s.charAt(i);
            } else {
                bool = false;
                if (top == -1) {
                    return false;
                }
                int open = arr[top];
                if (s.charAt(i) == ')' && open == '(') {
                    top--;
                } else if (s.charAt(i) == '}' && open == '{') {
                    top--;
                } else if (s.charAt(i) == ']' && open == '[') {
                    top--;
                } else {
                    return false;
                }
            }
        }
        if (bool || top > -1) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean valid(String s){
        char[] stack = new char [s.length()];
        int top = -1;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                stack[++top] = ')';
            } else if (ch=='{'){
                stack[++top] = '}';
            } else if (ch=='['){
                stack[++top] = ']';
            } else {
                if(top==-1 || stack[top--]!=ch){
                    return false;
                }
            }
        }
        return top==-1;
    }

    public static void main(String[] args) {
        String s = "{{[)]}}";
        System.out.println(isValid(s));
    }
}
