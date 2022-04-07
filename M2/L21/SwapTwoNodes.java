package M2.L21;

import M2.Node;

public class SwapTwoNodes {

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        if (i == j) {
            return head;
        }
        Node<Integer> c = head;
        Node<Integer> p = null;

        Node<Integer> i_node = null;
        Node<Integer> j_node = null;
        Node<Integer> i_pre = null;
        Node<Integer> j_pre = null;

        int pos = 0;

        while (c != null) {
            if (pos == i) {
                i_node = c;
                i_pre = p;
            } else if (pos == j) {
                j_node = c;
                j_pre = p;
            }
            p = c;
            c = c.next;
            pos++;
        }

        if (i_pre != null) {
            i_pre.next = j_node;
        } else {
            head = j_node;
        }

        if (j_pre != null) {
            j_pre.next = i_node;
        } else {
            head = i_node;
        }

        Node<Integer> temp = j_node.next;
        j_node.next = i_node.next;
        i_node.next = temp;

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.takeInput();
        head = swapNodes(head, 3, 4);
        Node.printLL(head);
    }
}
