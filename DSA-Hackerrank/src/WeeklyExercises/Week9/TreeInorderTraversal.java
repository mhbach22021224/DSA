package Week9;
import java.util.*;

public class TreeInorderTraversal {
    class Node {
        LinkedNode left;
        LinkedNode right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    class Solution {

/* you only have to complete the function given below.
Node is defined as

class Node {
    int data;
    Node left;
    Node right;
}

*/

        public static void inOrder(LinkedNode root) {
            if(root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
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

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            LinkedNode root = null;
            while(t-- > 0) {
                int data = scan.nextInt();
                root = insert(root, data);
            }
            scan.close();
            inOrder(root);
        }
    }
}