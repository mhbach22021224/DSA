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
class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        for(int i = 1; i < n; i++){
            int key = arr.get(i), j;

            for(j = i - 1; j >= 0 && arr.get(j) > key; j--){
                arr.set(j + 1, arr.get(j));
                printArray(arr);
            }

            arr.set(j + 1, key);
        }
        printArray(arr);

    }

    public static void printArray(List<Integer> arr) {
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}
public class InsertionSortPart1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            list.add(m);
        }
        Result.insertionSort1(n,list);
        Result.printArray(list);
    }
}
