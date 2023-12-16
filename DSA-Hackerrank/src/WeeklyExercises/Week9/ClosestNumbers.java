package Week9;

public class ClosestNumbers {
    public static int[] arr = new int[1000];

    public static void merge(int[] arr, int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int x = 0; x < n1; x++) {
            left[x] = arr[l + x];
        }
        for (int x = 0; x < n2; x++) {
            right[x] = arr[m + 1 + x];
        }
        i = 0;
        j = 0;
        k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
    public static void sort(int[] arr, int l, int r) {
        if(l < r) {
            int m = (l+r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr,l,m,r);
        }
    }
}
