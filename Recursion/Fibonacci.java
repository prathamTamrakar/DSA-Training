public class Fibonacci{
    public static int fibo(int n){
        if(n==0){
            return 0;
        } 
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);

    }
    public static void fn(int n){
        if(0<n){
            fn(--n);
            System.out.println(n);
            fn(--n);
        }

    }
    public static void main(String[] args) {
        // System.out.println(fibo(6));
        fn(6);
    }
}