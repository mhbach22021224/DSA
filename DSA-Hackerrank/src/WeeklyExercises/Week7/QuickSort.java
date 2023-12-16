package Week7;

import java.util.*;

public class QuickSort {

    public static void sort(int[] arr, int l, int r) {
        int p = arr[(l+r)/2];
        int i = l, j = r;
        while(i < j){
            while(arr[i] < p){
                i++;
            }
            while(arr[j] > p){
                j--;
            }
            if(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if(i < r){
            sort(arr, i, r);
        }
        if(l < j){
            sort(arr, l, j);
        }
    }
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr,0,n-1);
        printArray(arr);
    }
}