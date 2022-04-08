package M2.Test5;

import M2.Node;

public class NextNumber {

    private static Node<Integer> reverse(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> temp = reverse(head.next);
        Node<Integer> tail = head.next;
        tail.next = head;
        head.next = null;
        return temp;
    }

    public static Node<Integer> addOne(Node<Integer> head) {
        if (head == null) {
            return head;
        }
        head = reverse(head);

        int carry = 1;
        int num = 0;
        Node<Integer> temp = head;
        while (true) {
            num = temp.data + carry;
            carry = num / 10;
            temp.data = num % 10;
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }

        if (carry == 1) {
            Node<Integer> newNode = new Node<Integer>(carry);
            temp.next = newNode;
        }
        return reverse(head);

    }

    public static void main(String[] args) {
        System.out.println("Enter Elements into the LinkedList ");
        Node<Integer> head = Node.takeInput();
        head = addOne(head);
        Node.printLL(head);
    }
}
