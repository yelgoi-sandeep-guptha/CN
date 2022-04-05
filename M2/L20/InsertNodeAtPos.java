package M2.L20;

import java.util.Scanner;

public class InsertNodeAtPos {

    public static Node<Integer> insertElementIterative(Node<Integer> head, int pos, int element) {
        Node<Integer> newNode = new Node<>(element);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        int index = 0;
        Node<Integer> temp = head;
        while (index < pos - 1) {
            index++;
            temp = temp.next;
            if (temp == null) {
                return head;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static Node<Integer> insertElementRecursive(Node<Integer> head, int pos, int element) {
        if (pos == 0) {
            Node<Integer> newNode = new Node<>(element);
            newNode.next = head;
            return newNode;
        }

        if (head == null) {
            return head;
        }

        Node<Integer> smallHead = insertElementRecursive(head.next, pos - 1, element);
        head.next = smallHead;
        return head;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int pos = s.nextInt();
        int element = s.nextInt();

        Node<Integer> head = NodeTemplate.takeInput();

        head = insertElementRecursive(head, pos, element);

        System.out.println("The Elements in the LinkedList are : ");
        NodeTemplate.printLL(head);

        s.close();
    }
}