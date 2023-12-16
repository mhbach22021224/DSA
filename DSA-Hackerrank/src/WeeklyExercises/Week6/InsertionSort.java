package Week6;
import java.util.*;
public class InsertionSort {
    public static void insertionSort(int[] arr, int n){
        int index, value;
        for(int i = 1; i < n; i++) {
            index = i;
            value = arr[i];
            while (index > 0 && arr[index - 1] > value) {
                arr[index] = arr[index-1];
                index--;
            }
            arr[index] = value;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
