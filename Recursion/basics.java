public class basics {
    static void sum(int a){
        if(0<a){
            return;
        }
        System.out.println(a);
        sum(a-1);
    }
    public static void main(String[] args) {
        sum(5);
    }
}
