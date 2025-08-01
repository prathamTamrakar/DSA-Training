public class permutation {
    static int neumerator(int n){
        if(n==1){
            return 1;
        }
        return n*neumerator(n-1);
    }
    static int permu(int n , int r){
        return neumerator(n)/denomirator(n-r);
    }
    static int denomirator(int r){
        if(r==1){
            return 1;
        }

        return r*denomirator(r-1);
    }


    public static void main(String[] args) {
        System.out.println(permu(4, 2));
        System.out.println(permu(5, 2));

    }
}
