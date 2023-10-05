import java.util.Scanner;

public class BinarySearch {
    public static int solve(int[] a, int x) {
        int l = 0, r = a.length - 1;
        while(l < r) {
            int mid = l + (r - l) / 2;
            if(a[mid] < x) {
                l = mid + 1;
            }
            else {
                r = mid;
            }
        }
        if(a[l] == x) {
            return l;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(solve(arr,k));
    }
}