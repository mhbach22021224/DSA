package Week7;
import java.util.*;
public class QuickSortInPlace {
    public static int sort(int[] arr, int l, int r) {
        int pivot = arr[r];
        int j = l;
        for (int i = l; i < r; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        int temp = arr[j];
        arr[j] = arr[r];
        arr[r] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return j;
    }

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = sort(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }




    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n-1);

    }
}
