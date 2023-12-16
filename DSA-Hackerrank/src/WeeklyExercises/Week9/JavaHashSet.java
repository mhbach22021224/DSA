package Week9;
import java.util.*;
public class JavaHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int n = sc.nextInt();

        String[] s1 = new String[n];
        String[] s2 = new String[n];
        for(int i = 0; i < n; i++) {
            s1[i] = sc.next();
            s2[i] = sc.next();
        }
        for(int i = 0; i < n; i++) {
            set.add(s1[i] + " " + s2[i]);
            System.out.println(set.size());
        }

    }
}
