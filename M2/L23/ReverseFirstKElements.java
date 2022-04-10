package M2.L23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstKElements {

    public static Queue<Integer> reverseKElements(Queue<Integer> q, int k) {
        if (q.isEmpty() || k > q.size() || k <= 0) {
            return q;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }
        return q;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Enter the elements into the queue, end with -1 : ");
        int n = s.nextInt();
        while (n != -1) {
            q.add(n);
            n = s.nextInt();
        }
        System.out.println("Enter k value : ");
        int k = s.nextInt();
        q = reverseKElements(q, k);
        System.out.println("The elements after reversing the queue : ");
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        s.close();
    }
}
