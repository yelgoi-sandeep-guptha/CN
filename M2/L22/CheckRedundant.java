package M2.L22;

import java.util.Scanner;
import java.util.Stack;

public class CheckRedundant {

    private static boolean checkRedundantBrackets(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c != ')') {
                stack.push(c);
            } else {
                int count = 0;
                while (c != '(' && !stack.isEmpty()) {
                    c = stack.pop();
                    count++;
                }
                if (count <= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Expression ,must be balanced : ");
        String expression = s.next();
        if (checkRedundantBrackets(expression)) {
            System.out.println(expression + " contains redundant brackets.");
        } else {
            System.out.println("Expression doesn't contain redundant brackets.");
        }
        s.close();
    }
}