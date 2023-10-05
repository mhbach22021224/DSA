import java.util.Scanner;

public class ThreeSum {
    public static int[] arr = new int[1000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0) {
                         count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
