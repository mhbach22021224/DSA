package WeeklyExercises.Week3;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solve {

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

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

}

public class Pairs {
    public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         List<Integer> l = new ArrayList<>();
         for(int i = 0; i < n; i++) {
             int m = sc.nextInt();
             l.add(m);
         }
         int k = sc.nextInt();
         System.out.print(Solve.pairs(k,l));
    }
}
