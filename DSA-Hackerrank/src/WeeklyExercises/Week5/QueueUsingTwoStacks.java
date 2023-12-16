package Week5;
import java.util.Stack;
import java.util.Scanner;
public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()){
            switch(scanner.nextInt()){
                case 1:
                    stack1.push(scanner.nextInt());
                    break;
                case 2:
                    if(stack2.isEmpty()){
                        while(!stack1.isEmpty()){
                            stack2.push(stack1.pop());
                        }
                    }
                    if(!stack2.isEmpty()){
                        stack2.pop();
                    }
                    break;
                case 3:
                    if(stack2.isEmpty()){
                        while(!stack1.isEmpty()){
                            stack2.push(stack1.pop());
                        }
                    }
                    if(!stack2.isEmpty()){
                        System.out.println(stack2.peek());
                    }
                    break;
            }
        }
        scanner.close();
    }
}
