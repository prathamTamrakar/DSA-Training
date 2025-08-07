class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Build {
    Node BuildTree(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = BuildTree(root.left, val);
        } else {
            root.right = BuildTree(root.right, val);
        }
        return root;
    }

    void Search(Node root, int target) {
        if (root == null) {
            System.out.println("No element in the tree");
            return;
        }
        if (root.data == target) {
            System.out.println("Element Found");
        }
        if (target < root.data) {
            Search(root.left, target);
        } else {
            Search(root.right, target);
        }
    }

    int leafCount(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return leafCount(root.left) + leafCount(root.right);
    }


    int leafSum(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.data;
        }
        return leafSum(root.left) + leafSum(root.right);
    }
}

class binarySearchTree {
    public static void main(String[] args) {
        int[] arr = { 1, 24, 43, 32,5,64,32,324,87,1,3,9,4, 5, 23, 23, 4, 3 };
        Node root = null;
        Build list = new Build();
        for (int val : arr) {
            root = list.BuildTree(root, val);
        }
        int target = 23;
        list.Search(root, target);
        System.out.println(list.leafCount(root));
        System.out.println(list.leafSum(root));

    }
}