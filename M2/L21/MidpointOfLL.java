package M2.L21;

import M2.Node;

public class MidpointOfLL {

    public static Node<Integer> midpoint(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * Input pattern
     * 1
     * 1 2 3 4 5 6 -1
     * o/p 3
     */
    public static void main(String[] args) {
        Node<Integer> head = Node.takeInput();
        Node<Integer> midNode = midpoint(head);
        System.out.println("The midNode value is :" + midNode.data);
    }
}
