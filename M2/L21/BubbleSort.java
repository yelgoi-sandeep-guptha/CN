package M2.L21;

import M2.Node;

public class BubbleSort {
    public static int length(Node<Integer> head) {
        if (head == null) {
            return 0;
        }
        return 1 + length(head.next);
    }

    public static Node<Integer> bubblesort(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        int n = length(head);

        for (int i = 0; i < n - 1; i++) {
            Node<Integer> pre = null;
            Node<Integer> curr = head;
            for (int j = 0; j < (n - i - 1); j++) {
                if (curr.data <= curr.next.data) {
                    pre = curr;
                    curr = curr.next;
                } else {
                    if (pre == null) {
                        Node<Integer> nextNode = curr.next;
                        curr.next = nextNode.next;
                        nextNode.next = curr;
                        head = nextNode;
                        pre = nextNode;
                    } else {
                        Node<Integer> nextNode = curr.next;
                        curr.next = nextNode.next;
                        nextNode.next = curr;
                        pre.next = nextNode;
                        pre = nextNode;
                    }
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.takeInput();
        head = bubblesort(head);
        Node.printLL(head);
    }
}
