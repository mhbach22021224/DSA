package Week9;

import java.util.*;

class LinkedNode {
    LinkedNode left;
    LinkedNode right;
    int data;

    LinkedNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solve {
    public static void preOrder(LinkedNode root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static LinkedNode insert(LinkedNode root, int data) {
        if(root == null) {
            return new LinkedNode(data);
        } else {
            LinkedNode cur;
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
public class TreePreorderTraversal {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            LinkedNode root = null;
            while(t-- > 0) {
                int data = scan.nextInt();
                root = insert(root, data);
            }
            scan.close();
            preOrder(root);
        }
    }
}
