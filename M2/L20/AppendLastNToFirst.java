package M2.L20;

import java.util.Scanner;

public class AppendLastNToFirst {

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        if (head == null || n == 0) {
            return head;
        }

        Node<Integer> fast = head;
        Node<Integer> slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        Node<Integer> newHead = slow.next;
        fast.next = head;
        slow.next = null;
        return newHead;
    }

    /**
     * Input pattern
     * n
     * testcases
     * enter elements -1
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Node<Integer> head = NodeTemplate.takeInput();
        head = appendLastNToFirst(head, n);
        NodeTemplate.printLL(head);
        s.close();
    }
}
