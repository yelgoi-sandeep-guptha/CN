package M2.L21;

import M2.Node;

public class ReverseLL {

    public static Node<Integer> reverseLLIterative(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> pre = null;
        Node<Integer> curr = head;
        Node<Integer> nextNode = curr.next;

        while (true) {
            curr.next = pre;
            pre = curr;
            curr = nextNode;
            if (nextNode == null) {
                break;
            }
            nextNode = nextNode.next;
        }
        return pre;
    }

    public static Node<Integer> reverseLLRecursive(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> reverseHead = reverseLLRecursive(head.next);
        Node<Integer> tail = head.next;
        tail.next = head;
        head.next = null;
        return reverseHead;
    }

    /**
     * Input pattern
     * testcases
     * Enter elements ,end with -1
     * 1
     * 1 2 3 4 5 -1
     * o/p 5 4 3 2 1
     * 
     */

    public static void main(String[] args) {
        Node<Integer> head = Node.takeInput();
        head = reverseLLRecursive(head);
        Node.printLL(head);
    }
}