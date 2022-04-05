package M2.L20;

import java.util.Scanner;

public class PrintithNode {

    public static int printithNodeIterative(Node<Integer> head, int index) {
        int count = 0;
        Node<Integer> temp = head;
        while (count < index) {
            count++;
            temp = temp.next;
            if (temp == null) {
                return -1;
            }
        }
        return temp.data;
    }

    public static int printithNodeRecursive(Node<Integer> head, int index) {
        if (index == 0) {
            return head.data;
        }
        if (head == null) {
            return -1;
        }
        return printithNodeRecursive(head.next, index - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int index = s.nextInt();
        Node<Integer> head = LengthOfLL.takeInput();
        System.out.println("The ith Node in the Linked List is : " + printithNodeIterative(head, index));
        s.close();
    }
}

/**
 * format for input
 * index
 * testcases
 * elements to be inserted into the LinkedList till -1
 */