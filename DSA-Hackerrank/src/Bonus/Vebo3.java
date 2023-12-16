package Bonus;
import java.io.*;
import java.util.*;
class Pair {
    int key;
    int val;
    Pair(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
public class Vebo3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> res = new ArrayList<>();
        long money = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>(n, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.val - o2.val;
            }
        });
        for(int i = 0; i < n - 1; i++) {
            int q = sc.nextInt();
            if(q == 1) {
                int u = sc.nextInt();
                pq.add(new Pair(i + 1, u));
            } else {
                int v = sc.nextInt();
                while(!pq.isEmpty() && pq.size() >= v) {
                    pq.poll();
                }
            }
        }
        while(!pq.isEmpty()) {
            Pair tmp = pq.poll();
            money += tmp.val;
            res.add(tmp.key);
        }
        if(res.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(money);
            Collections.sort(res);
            for(int x : res) {
                System.out.print(x + " ");
            }
        }
    }
}