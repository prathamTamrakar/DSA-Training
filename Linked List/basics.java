
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class basics {

    Node head;

    public void addTofirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addToLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertInMiddle(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " " + temp.next + " -> ");
            temp = temp.next;
        }
    }

    public void pop_front() {
        head = head.next;
    }

    public void pop_back() {
        Node temp = head;
        while (temp.next.next != null && temp.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void popInMiddle(int pos) {

        Node temp = head;
        if(head.next==null){
            head = null;
            return;
        }
        if (pos == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp.next.next == null) {
            temp.next = null;
            return;
        }

        temp.next = temp.next.next;
    }

    public void reverseLinkedList(){

    }

    public static void main(String[] args) {
        basics list = new basics();
        list.addTofirst(7);
        list.addTofirst(6);
        list.addTofirst(5);
        list.display();
        System.out.println();
        list.addToLast(8);
        list.addToLast(9);
        list.addToLast(10);
        list.display();
        list.insertInMiddle(11, 3);
        list.insertInMiddle(12, 1);
        list.insertInMiddle(13, 0);
        System.out.println();
        list.display();
        list.pop_front();
        list.pop_front();
        System.out.println();
        list.display();
        list.pop_back();
        System.out.println();
        list.display();
        list.popInMiddle(3);
        list.popInMiddle(0);
        System.out.println();
        list.display();
        list.popInMiddle(3);
        System.out.println();
        list.display();
    }
}
