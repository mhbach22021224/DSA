
public class Queue {
    private int[] q = new int[10000];
    private int top = -1;
    private int bottom = 0;
    public void add(int i) {
        q[++top] = i;
    }
    public void pop() {
        ++bottom;
    }
    public int peek() {
        return q[bottom];
    }
}

