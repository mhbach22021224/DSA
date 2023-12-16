package Week10;

public class IsThisABinaryTree {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static int[] a = new int[100000];
    public static int sz = 0;
    void inOrder(Node root) {
        if(root == null)     return;
        inOrder(root.left);
        a[sz++] = root.data;
        inOrder(root.right);
    }
    boolean checkBST(Node root) {
        inOrder(root);
        for(int i = 1; i < sz; i++) {
            if(a[i] <= a[i-1])      return false;
        }
        return true;
    }
}
