package M2.L20;

import java.util.Scanner;

public class DeleteNodeAtPos {

    public static Node<Integer> deleteIterative(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }

        if (pos == 0) {
            return head.next;
        }

        Node<Integer> temp = head;
        int index = 0;
        while (index < pos - 1) {
            index++;
            temp = temp.next;
            if (temp == null) {
                return head;
            }
        }
        temp.next = temp.next.next;
        return head;
    }

    public static Node<Integer> deleteRecursive(Node<Integer> head, int pos) {
        if (pos == 0) {
            return head.next;
        }
        if (head.next == null) {
            return head;
        }

        Node<Integer> smallHead = deleteRecursive(head.next, pos - 1);
        head.next = smallHead;
        return head;
    }

    /**
     * 
     * position
     * testcases
     * Enter elements -1
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pos = s.nextInt();

        Node<Integer> head = NodeTemplate.takeInput();

        // head = deleteIterative(head, pos);
        head = deleteRecursive(head, pos);

        NodeTemplate.printLL(head);
        s.close();
    }
}
