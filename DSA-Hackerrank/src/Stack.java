public class Stack {
    int[] s = new int[10000];
    int top = -1;
    public void add (int i) {
        s[++top] = i;
    }
    public void pop() {
        if (top >= 0) {
            --top;
        }
    }
    public int pull() {
        return s[top];
    }
    public boolean isEmpty() {
        return top < 0;
    }
    public int size() {
        return top + 1;
    }
}
