package M2.L20;

import java.util.Scanner;

public class FindNode {

    public static int findIterative(Node<Integer> head, int key) {
        if (head == null) {
            return -1;
        }
        int pos = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            if (temp.data.equals(key)) {
                return pos;
            }
            pos++;
            temp = temp.next;
        }
        return -1;
    }

    public static int findRecursive(Node<Integer> head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data.equals(key)) {
            return 0;
        }
        int pos = findRecursive(head.next, key);
        if (pos == -1) {
            return pos;
        }
        return 1 + pos;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int key = s.nextInt();
        Node<Integer> head = NodeTemplate.takeInput();
        int pos = findRecursive(head, key) + 1;
        if (pos == 0) {
            System.out.println("The element " + key + " is not found in the LinkedList");
        } else {
            System.out.println("The element " + key + " found at " + pos + " position");
        }
        s.close();
    }
}
