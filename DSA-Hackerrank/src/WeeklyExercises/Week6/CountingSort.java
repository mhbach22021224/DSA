package Week6;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i < 100;i++){
            ans.add(0);
        }
        for(int i = 0;i <arr.size();i++){
            int a = ans.get(arr.get(i))+1;
            ans.set(arr.get(i),a);
        }
        return ans;
    }

}

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            list.add(m);
        }
        List<Integer> ans = Solution.countingSort(list);
        for(Integer x : ans) {
            System.out.print(x + " ");
        }
    }
}
