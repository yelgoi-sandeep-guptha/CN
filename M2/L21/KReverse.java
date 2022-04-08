package M2.L21;

import M2.Node;

public class KReverse {

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        if (k == 1 || k == 0 || head == null || head.next == null) {
            return head;
        }

        Node<Integer> curr = head;
        Node<Integer> pre = null;
        Node<Integer> nextNode = null;

        int count = 0;

        while (count < k && curr != null) {
            nextNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextNode;
            count++;
        }

        if (nextNode != null) {
            head.next = kReverse(nextNode, k);
        }
        return pre;
    }

    /**
     * Input pattern
     * testcases
     * Enter elements -1
     * 1
     * 1 2 3 4 5 6 7 8 9 (if k = 3)
     * o/p 3 2 1 6 5 4 9 8 7
     * 
     */
    public static void main(String[] args) {
        Node<Integer> head = Node.takeInput();
        head = kReverse(head, 3);
        Node.printLL(head);
    }
}