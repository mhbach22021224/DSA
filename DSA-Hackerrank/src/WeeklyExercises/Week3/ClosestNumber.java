package WeeklyExercises.Week3;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {

    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        arr.sort(null);
        List<Integer> res = new ArrayList<>();

        int minDistance = Integer.MAX_VALUE;

        for(int i = 1; i < arr.size(); i++) {
            int a = arr.get(i-1);
            int b = arr.get(i);

            int distance = Math.abs(b-a);
            if(distance == minDistance) {
                res.add(a);
                res.add(b);
            }

            if(distance < minDistance) {
                minDistance = distance;

                res.clear();
                res.add(a);
                res.add(b);
            }
        }
        return res;
    }

}

public class ClosestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            l.add(m);
        }
        List<Integer> ans = Solution.closestNumbers(l);
        for(int x : ans) {
            System.out.print(x + " ");
        }
    }
}
