package M2.L22;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

    public static void reverse(Stack<Integer> stack, Stack<Integer> extra) {
        if (stack.size() <= 1) {
            return;
        }
        int lastElement = stack.pop();
        reverse(stack, extra);
        while (!stack.isEmpty()) {
            extra.push(stack.pop());
        }
        stack.push(lastElement);
        while (!extra.isEmpty()) {
            stack.push(extra.pop());
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> extra = new Stack<>();
        System.out.print("Enter elements into the stack : ");
        int num = s.nextInt();
        while (num != -1) {
            stack.push(num);
            num = s.nextInt();
        }
        reverse(stack, extra);
        System.out.print("After reversing the stack the elements are : ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        s.close();
    }
}
