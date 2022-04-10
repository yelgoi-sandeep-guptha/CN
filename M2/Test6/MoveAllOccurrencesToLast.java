package M2.Test6;

import java.util.Scanner;

class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class MoveAllOccurrencesToLast {
    static Scanner s = new Scanner(System.in);

    public static Node<Integer> createlist() {
        Node<Integer> head = null;
        Node<Integer> rear = null;
        int data = s.nextInt();
        while (data != -1) {
            Node<Integer> newnode = new Node<Integer>(data);
            if (head == null) {
                head = newnode;
                rear = head;
            } else {
                rear.next = newnode;
                rear = rear.next;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private static Node<Integer> moveToLast(Node<Integer> head, int n) {
        if (head == null) {
            return head;
        }
        Node<Integer> tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        Node<Integer> temp = head;
        Node<Integer> pre = null;
        for (int i = 0; i < length; i++) {
            if (temp.data == n) {
                if (pre == null) {
                    head = head.next;
                    tail.next = temp;
                    temp.next = null;
                    tail = tail.next;
                    temp = head;
                } else {
                    pre.next = temp.next;
                    tail.next = temp;
                    temp.next = null;
                    tail = tail.next;
                    temp = pre.next;
                }
            } else {
                pre = temp;
                temp = temp.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        System.out.println("Enter elements into the LinkedList : ");
        Node<Integer> head1 = createlist();
        System.out.println("Enter key value : ");
        int n = s.nextInt();
        print(moveToLast(head1, n));
    }
}
