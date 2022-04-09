package M2.L22;

import java.util.Scanner;
import java.util.Stack;

public class CountBracketReversal {

    public static int count(String expression) {
        int len = expression.length();
        if (len == 0) {
            return 0;
        }
        if (len % 2 != 0) {
            return -1;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            char c = expression.charAt(i);
            if (c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                }
            }
        }
        int count = 0;

        while (!stack.isEmpty()) {
            int c1 = stack.pop();
            int c2 = stack.pop();
            if (c1 != c2) {
                count++;
            } else {
                count = count + 2;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the expression , use only '{}' : ");
        String expression = s.next();
        int minReversal = count(expression);
        if (minReversal == -1) {
            System.out.println("Expression can't be balanced.");
        } else {
            System.out.print(
                    "Minimum number of bracket reversal are required to balance the expression : " + minReversal);
        }
        s.close();
    }
}
