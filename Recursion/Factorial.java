public class Factorial {
    public static int fact(int n){
        if(0==n || n==1){
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        int factorial = fact(5);
        System.out.println(factorial);
    }
}