import java.util.Scanner;

public class LinkedList {
    static class Node {
        public int data;
        public Node next;

        public Node(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class Llist {
        public Node head;
        public Node tail;

        public Llist() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            Node node = new Node(nodeData);
            if(this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static Node insertAtPosition(Node l, int data, int pos) {
        Node node = new Node(data);
        if(pos == 0) {
            l = node;
        }
        else {
            Node newNode = l;
            for(int i = 0; i < pos -1; i++) {
                newNode = newNode.next;
            }
            node.next = newNode.next;
            newNode.next = node;
        }
        return l;
    }
    static void printList(Node l) {
        Node p = l;
        while(p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Llist l = new Llist();

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int item = sc.nextInt();
            l.insertNode(item);
        }
        int newData = sc.nextInt();
        int pos = sc.nextInt();

        Node a = insertAtPosition(l.head, newData, pos);
        printList(l.head);

    }
}