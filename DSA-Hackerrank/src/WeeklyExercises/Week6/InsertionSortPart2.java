package Week6;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Res {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort2(int n, List<Integer> arr) {
        int index, value;
        for(int i = 1; i < n; i++) {
            index = i - 1;
            value = arr.get(i);
            while(index >= 0 && arr.get(index) > value) {
                arr.set(index + 1, arr.get(index));
                index--;
            }
            arr.set(index + 1, value);
            printArray(arr);
        }


    }

    public static void printArray(List<Integer> arr){
        for(int k = 0; k < arr.size(); k++){
            System.out.print(arr.get(k) + " ");
        }
        System.out.println();
    }

}

public class InsertionSortPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            list.add(m);
        }
        Res.insertionSort2(n,list);
        Res.printArray(list);
    }
}

