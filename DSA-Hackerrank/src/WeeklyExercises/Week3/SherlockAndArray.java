package WeeklyExercises.Week3;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        int leftSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            int rightSum = sum - leftSum - arr.get(i);
            if(leftSum == rightSum) {
                return "YES";
            }
            leftSum = leftSum + arr.get(i);
        }
        return "NO";
    }

}

public class SherlockAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            l.add(m);
        }
        String res = Result.balancedSums(l);
        System.out.println(res);
    }
}

