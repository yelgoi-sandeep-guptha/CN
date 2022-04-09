package M2.L22;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    public static int[] stockspan(int[] price, int n) {
        Stack<Integer> stack = new Stack<>();
        int stock[] = new int[n];
        stack.push(0);
        stock[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && price[stack.peek()] < price[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                stock[i] = i + 1;
            } else {
                stock[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return stock;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of price list : ");
        int n = s.nextInt();
        System.out.print("Enter prices : ");
        int price[] = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = s.nextInt();
        }

        int[] stock = stockspan(price, n);

        System.out.print("The stock span of the price list : ");
        for (int i = 0; i < n; i++) {
            System.out.print(stock[i] + " ");
        }
        s.close();
    }
}
