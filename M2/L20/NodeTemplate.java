package M2.L20;

import java.util.Scanner;

public class NodeTemplate {

    public static void printLL(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /**
     * takeInput pattern
     * testcases
     * enter elements till -1
     * 
     */

    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        Node<Integer> head = null;
        while (testCases != 0) {
            int element = s.nextInt();
            while (element != -1) {
                head = addElement(head, element);
                element = s.nextInt();
            }
            testCases--;
        }
        s.close();
        return head;
    }

    public static Node<Integer> addElement(Node<Integer> head, int data) {
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
}