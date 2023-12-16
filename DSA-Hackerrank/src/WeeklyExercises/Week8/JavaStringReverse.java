package Week8;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(s.length()-i-1)) {
                System.out.println("YES");
                break;
            }  else {
                System.out.println("NO");
                break;
            }
        }
    }
}
