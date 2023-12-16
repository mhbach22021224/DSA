package Week7;
import java.util.Scanner;
public class MergeSort {
    public static int[] arr = new int[100000];
    public static void merge(int[] arr, int l, int m, int r) {
        int i,j,k;
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }
        for(j = 0; j < n2; j++) {
            right[j] = arr[m+j+1];
        }
        i = 0; j = 0; k = l;
        while(i < n1 && j < n2) {
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] arr, int l, int r) {
        if(l < r){
            int mid = (l+r)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr,0,n-1);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
