package M2.L21;

import M2.Node;

public class EvenAfterOdd {

    public static Node<Integer> oddEven(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> evenHead = null, evenTail = null, oddHead = null, oddTail = null;

        while (head != null) {
            if (head.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = head;
                    evenTail = head;
                } else {
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = head;
                    oddTail = head;
                } else {
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
        }
        if (oddHead == null) {
            return evenHead;
        } else {
            oddTail.next = evenHead;
        }
        if (evenHead != null) {
            evenTail.next = null;
        }
        return oddHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.takeInput();
        head = oddEven(head);
        Node.printLL(head);
    }
}
