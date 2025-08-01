class Queue {
    int front = 0;
    int rear = -1;
    int n;
    int[] arr;

    Queue(int n) {
        this.n = n;
        arr = new int[n];
    }

    void push(int data) {
        if (rear == n - 1) {
            System.out.println("Queue is Full");
        } else {
            arr[++rear] = data;
        }
    }

    void pop() {
        if (rear == -1) {
            System.out.println("Queue is Empty");
        } else {
            front++;
        }
    }

    void display() {
        if (rear == -1) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }

    }
}

public class Basics {
    public static boolean isValid(String s) {
        char[] arr = new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                arr[++top] = s.charAt(i);
                System.out.println(arr[top]);
            } else{
                if(top==-1){
                    return false;
                }else if(arr[top]==s.charAt(i)){
                    top--;
                }else{
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        // Queue queue = new Queue(5);
        // queue.push(1);
        // queue.push(2);
        // queue.push(3);
        // queue.display();
        // queue.pop();
        // queue.display();
        String s = "([])";
        System.out.println(isValid(s));


    }
}
