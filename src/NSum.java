import java.util.Scanner;

public class NSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1000];
        int[] b = new int[10000];
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        b[0] = 0;
        int size = 1;
        for(int i = 0; i < n; i++) {
            int p_size = size;
            for(int j = 0; j < p_size; j++) {
                b[size] = b[j] + a[i];
                size++;
            }
        }
        for(int i = 0; i < size; i++) {
            System.out.print(b[i] + " ");
        }
    }
}