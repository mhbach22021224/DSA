package Bonus;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Vebo2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long sum = 0;
        for(int i = 0; i < n; i++) {
            int v = sc.nextInt();
            if(pq.size() < k) {
                sum += v;
                pq.add(v);
            }
            else {
                if(v > pq.peek()) {
                    sum -= pq.poll();
                    sum += v;
                    pq.add(v);
                }
            }
            System.out.print(sum + " ");
        }

    }
}
