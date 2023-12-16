package Week7;
import java.util.*;
public class FindTheMedian {
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int n = arr.size();
        if(n % 2 == 0) {
            return (arr.get(n/2) + arr.get((n/2)+1)) / 2;
        }
        return arr.get(n/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            list.add(m);
        }
        System.out.println(findMedian(list));
    }
}
