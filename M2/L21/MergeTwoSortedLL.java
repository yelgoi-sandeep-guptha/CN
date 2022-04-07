package M2.L21;

import java.util.Scanner;

import M2.Node;

public class MergeTwoSortedLL {

    Scanner s = new Scanner(System.in);

    public Node<Integer> takeInput() {
        Node<Integer> head = null;
        int element = s.nextInt();
        while (element != -1) {
            head = addElement(head, element);
            element = s.nextInt();
        }
        return head;
    }

    public Node<Integer> addElement(Node<Integer> head, int data) {
        Node<Integer> newNode = new Node<Integer>(data);
        if (head == null) {
            return newNode;
        }
        Node<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public Node<Integer> mergeIterative(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node<Integer> newHead = null;
        Node<Integer> newTail = null;

        if (head1.data < head2.data) {
            newHead = head1;
            newTail = head1;
            head1 = head1.next;
        } else {
            newHead = head2;
            newTail = head2;
            head2 = head2.next;
        }

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                newTail.next = head1;
                newTail = newTail.next;
                head1 = head1.next;
            } else {
                newTail.next = head2;
                newTail = newTail.next;
                head2 = head2.next;
            }
        }

        if (head1 != null) {
            newTail.next = head1;
        }
        if (head2 != null) {
            newTail.next = head2;
        }
        return newHead;
    }

    public Node<Integer> mergeRecursive(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (head1.data < head2.data) {
            Node<Integer> temp = mergeRecursive(head1.next, head2);
            head1.next = temp;
            return head1;
        }
        Node<Integer> temp = mergeRecursive(head1, head2.next);
        head2.next = temp;
        return head2;
    }

    public static void main(String[] args) {
        MergeTwoSortedLL obj = new MergeTwoSortedLL();
        Node<Integer> head1 = obj.takeInput();
        Node<Integer> head2 = obj.takeInput();
        Node<Integer> head = obj.mergeRecursive(head1, head2);
        Node.printLL(head);
    }
}
