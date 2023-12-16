package Bonus;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Vebo6 {
    public static int cookies(int k, List<Integer> A) {
        // Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(A);
        int process = 0;

        while(pq.peek() < k && pq.size() >= 2) {
            int a = pq.remove();
            int b = pq.remove();
            int c = a + (b * 2);
            pq.add(c);
            process++;
        }
        if(pq.peek() >= k) {
            return process;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            list.add(m);
        }
        int k = sc.nextInt();
        System.out.println(cookies(k,list));
    }
}
