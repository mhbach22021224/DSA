package Week10;

import java.util.Scanner;

public class HeightOfABinaryTree {
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
    public static int height(Node root) {
        // Write your code here.
        if(root == null) {
            return -1;
        }
        int rootLeft = height(root.left);
        int rootRight = height(root.right);
        return Math.max(rootLeft,rootRight) + 1;
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        while(n-- > 0) {
            int data = sc.nextInt();
            root = insert(root,data);
        }
        sc.close();
        int height = height(root);
        System.out.println(height);
    }
}
