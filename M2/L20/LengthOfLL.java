package M2.L20;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class LengthOfLL {

    public static int lengthIterative(Node<Integer> head) {
        if (head == null) {
            return 0;
        }
        int length = 0;
        Node<Integer> temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        return length;
    }

    public static int lengthRecursive(Node<Integer> head) {
        if (head == null) {
            return 0;
        }
        return 1 + lengthRecursive(head.next);
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

    public static void printLL(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        System.out.print("The Elements in the LinkedList are : ");
        printLL(head);
        System.out.println("The length of Linked List Using Iterative is " + lengthIterative(head));
        System.out.println("The length of Linked List Using Recursive is " + lengthRecursive(head));
    }
}