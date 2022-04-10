package M2.L23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {
    public static void reverse(Queue<Integer> q) {
        if (q.size() <= 1) {
            return;
        }
        int front = q.poll();
        reverse(q);
        q.add(front);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<Integer>();
        System.out.println("Enter the elements into the queue, Enter -1 to end the queue : ");
        int n = s.nextInt();
        while (n != -1) {
            q.add(n);
            n = s.nextInt();
        }
        reverse(q);
        System.out.println("The elements after reversing the queue : ");
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        s.close();
    }
}
