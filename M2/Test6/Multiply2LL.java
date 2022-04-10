package M2.Test6;

import java.util.Scanner;

class LLNode {
    int data;
    LLNode next;

    LLNode(int data) {
        this.data = data;
    }
}

public class Multiply2LL {

    private static LLNode reverse(LLNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        LLNode temp = reverse(head.next);
        LLNode tail = head.next;
        tail.next = head;
        head.next = null;
        return temp;
    }

    private static int length(LLNode head) {
        if (head == null) {
            return 0;
        }
        return 1 + length(head.next);
    }

    private static LLNode makeLLOfSize(int n) {
        if (n == 0) {
            return null;
        }
        LLNode head = null, tail = null;
        for (int i = 0; i < n; i++) {
            LLNode node = new LLNode(0);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }

    private static LLNode addFirst(LLNode head) {
        LLNode newNode = new LLNode(0);
        if (head == null) {
            head = null;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    private static void multiply(LLNode head1, LLNode head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);

        int len1 = length(head1);
        int len2 = length(head2);

        LLNode first = head1;
        LLNode second = head2;

        int carry = 0;
        LLNode res1 = makeLLOfSize(len1 + len2 + 1);

        while (second != null) {
            LLNode res2 = makeLLOfSize(len1 + len2 + 1);
            first = head1;
            LLNode temp1 = res1;
            LLNode temp2 = res2;
            carry = 0;

            while (first != null) {
                int ans = temp1.data + carry + second.data * first.data;
                temp2.data = ans % 10;
                carry = ans / 10;
                temp1 = temp1.next;
                temp2 = temp2.next;
                first = first.next;
            }

            if (carry != 0) {
                int ans = temp1.data + carry;
                temp2.data = ans;
            }

            res1 = res2;
            head1 = addFirst(head1);

            second = second.next;
        }

        res1 = reverse(res1);
        printLL(res1);

    }

    private static void printLL(LLNode head) {
        if (head == null) {
            return;
        }
        while (head.data == 0) {
            head = head.next;
        }

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private LLNode takeInput() {
        LLNode head = null;
        LLNode tail = null;
        int n = s.nextInt();
        while (n != -1) {
            LLNode node = new LLNode(n);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            n = s.nextInt();
        }
        return head;
    }

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Multiply2LL obj = new Multiply2LL();
        System.out.println("Enter elements into Linked List 1 : ");
        LLNode head1 = obj.takeInput();
        System.out.println("Enter elements into Linked List 2 : ");
        LLNode head2 = obj.takeInput();
        multiply(head1, head2);
        s.close();
    }
}
