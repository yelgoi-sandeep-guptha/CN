package M2.L22;

import java.util.Scanner;
import java.util.Stack;

public class BracketBalanced {

    public static boolean isBalanced(String expression) {
        if (expression.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the expression '()' : ");
        String expression = s.next();
        if (isBalanced(expression)) {
            System.out.println("The Expression is balanced ");
        } else {
            System.out.println("The Expression is not balanaced ");
        }
        s.close();
    }
}
