import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Build{
    static int id = -1;

    public Node BuildNode(int[] node){
        id++;
        if(node[id]==-1){
            return null;
        }
        Node newNode = new Node(node[id]);
        newNode.left = BuildNode(node);
        newNode.right = BuildNode(node);
        return newNode;
    }

    static void levelWise(Node root){
        if(root==null) return;

        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node cuNode = q.poll();
            System.out.println(cuNode.data+" ");
            if(cuNode.left!=null){
                q.add(cuNode.left);
            }
            if(cuNode.right!=null){
                q.add(cuNode.right);
            }
        }

    }

    void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root){
        if(root==null) return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    void inorder(Node root){
        if(root==null) return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    int sum(Node root){
        if(root==null) return 0;
        return root.data+sum(root.left)+sum(root.right);
    }
     
}


public class tree {
    public static void main(String[] args) {
        int[] node = {1,2,4,-1,-1,-1,3,-1,-1};
        Build list = new Build();
        Node temp = list.BuildNode(node);
        System.out.println("preorder");
        list.preorder(temp);
        System.out.println();
        System.out.println("postorder");
        list.postorder(temp);
        System.out.println();
        System.out.println("inorder");
        list.inorder(temp);
        System.out.println();
        list.levelWise(temp);
        System.out.println(list.sum(temp));

    }
} 
