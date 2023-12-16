package WeeklyExercises.Week11;

import WeeklyExercises.Week3.Solve;

import java.io.IOException;
import java.util.*;

public class Pairs {
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        int count = 0;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.size(); i++) {
            Integer a = mp.get(arr.get(i));
            if(a != null) {
                mp.put(arr.get(i), mp.get(arr.get(i)) + 1);
            } else {
                mp.put(arr.get(i), 1);
            }
        }
        for(int i = 0; i < mp.size(); i++) {
            if(mp.get(arr.get(i) - k) != null) {
                count += mp.get(arr.get(i) - k);
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            l.add(m);
        }
        int k = sc.nextInt();
        System.out.print(pairs(k,l));
    }
}
