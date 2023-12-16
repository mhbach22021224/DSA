package Week5;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr, int n){
        int index;
        for(int i = 0; i < n - 1; i++){
            index = i;
            for(int j = i + 1; j < n; j++){
                if(arr[index] > arr[j]){
                    index = j;
                }
            }
            if(i != index){
                int tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr,n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
