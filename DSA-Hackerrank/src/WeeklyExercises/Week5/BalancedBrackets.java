package Week5;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if( (ch == '(') || (ch == '[') || (ch == '{'))
            {
                st.push(ch);
            }
            else
            {
                if(!st.empty())
                {
                    char top = st.peek();
                    if((ch == ')' && top == '(') || (ch == ']' && top == '[') || (ch == '}' && top == '{'))
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
        }
        if(st.empty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            if(isValid(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
