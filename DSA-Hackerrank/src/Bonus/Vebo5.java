package Bonus;
import java.util.*;
public class Vebo5 {
    public static int[] arr = new int[1200001];
    public static int[] ST = new int[1200001];

    public static void build(int id, int start, int end) {
        if (start == end) {
            ST[id] = arr[start];
        } else {
            int mid = (start + end) / 2;
            build(2 * id, start, mid);
            build(2 * id + 1, mid + 1, end);
            ST[id] = Math.min(ST[2 * id], ST[2 * id + 1]);
        }
    }
    public static void update(int id, int l, int r, int i, int v) {
        if (i < l || r < i) {
            return ;
        }
        if (l == r) {
            ST[id] = v;
            arr[l] = v;
            return ;
        }

        int mid = (l + r) / 2;
        update(id*2, l, mid, i, v);
        update(id*2 + 1, mid+1, r, i, v);

        ST[id] = Math.min(ST[id*2], ST[id*2 + 1]);
    }

    public static int get(int id, int l, int r, int u, int v) {
        if (v < l || r < u) {
            return Integer.MAX_VALUE;
        }
        if (u <= l && r <= v) {
            return ST[id];
        }
        int mid = (l + r) / 2;
        return Math.min(get(id*2, l, mid, u, v), get(id*2 + 1, mid+1, r, u, v));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i+1] = sc.nextInt();
        }
        build(1,1,n);
        int s = sc.nextInt();
        for(int i = 0; i < s; i++) {
            int q = sc.nextInt();
            if(q == 1) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                System.out.println(get(1, 1, n, l, r));
            }
            if(q == 2) {
                int id = sc.nextInt();
                int v = sc.nextInt();
                update(1,1,n, id, v);
            }
        }
    }
}
