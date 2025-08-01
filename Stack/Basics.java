class StackImplementation {
    int top = -1;
    int n;
    int[] arr;

    public StackImplementation(int n) {
        this.n = n;
        arr = new int[n];
    }

    void push(int data) {
        if (top == n - 1) {
            System.out.println("Stack is Full");
            return;
        } else {
            arr[++top] = data;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            top--;
        }
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class Basics {
    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(5);
        stack.push(1);
        stack.push(2);
        stack.display();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); // This will print "Stack is Full"
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();


    }
}
