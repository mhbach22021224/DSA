package Week5;
import java.util.*;
public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        Stack<String> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();

            switch (x) {
                case 1:
                {
                    st.push(s);

                    String append = sc.next();
                    s += append;
                    break;
                }

                case 2:
                {
                    st.push(s);

                    int k = sc.nextInt();
                    String s1 = s.substring(0, s.length() - k);
                    s = s1;
                    break;
                }

                case 3:
                {
                    int k = sc.nextInt();
                    System.out.println(s.charAt(k-1));
                    break;
                }

                case 4:
                {
                    if(!st.empty())
                    {
                        String s2 = st.pop();
                        s = s2;
                    }
                    break;
                }
            }
        }
    }
}
