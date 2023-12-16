package Bonus;



import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Vebo1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            int h = sc.nextInt();
            if(!max.isEmpty() && h >= max.peek()) {
                min.add(h);
            } else {
                max.add(h);
            }
            if(max.size() - min.size() > 1) {
                min.add(max.remove());
            }  else if(min.size() > max.size()) {
                max.add(min.remove());
            }
        }
        for(int i = 0; i < m; i++) {
            int e = sc.nextInt();
            if(e == 1) {
                int h = sc.nextInt();
                if(!max.isEmpty() && h >= max.peek()) {
                    min.add(h);
                } else {
                    max.add(h);
                }
                if(max.size() - min.size() > 1) {
                    min.add(max.remove());
                }  else if(min.size() > max.size()) {
                    max.add(min.remove());
                }
            }
            if(e == 2) {
                max.remove();
                if(min.size() > max.size()) {
                    max.add(min.remove());
                }
            }
            if(e == 3) {
                System.out.println(max.peek());
            }
        }
    }
}
