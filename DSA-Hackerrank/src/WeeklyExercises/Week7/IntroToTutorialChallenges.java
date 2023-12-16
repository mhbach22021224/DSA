package Week7;
import java.util.*;

public class IntroToTutorialChallenges {
    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == V) {
                return i;
            }
        }
        return arr.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            list.add(m);
        }
        int k = sc.nextInt();
        System.out.println(introTutorial(k,list));
    }
}
