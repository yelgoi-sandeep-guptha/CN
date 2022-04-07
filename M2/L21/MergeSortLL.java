package M2.L21;

import M2.Node;

public class MergeSortLL {

    public static Node<Integer> midpoint(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (head1.data < head2.data) {
            Node<Integer> temp = merge(head1.next, head2);
            head1.next = temp;
            return head1;
        }
        Node<Integer> temp = merge(head1, head2.next);
        head2.next = temp;
        return head2;
    }

    public static Node<Integer> mergeSort(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> mid = midpoint(head);

        Node<Integer> part1Head = head;
        Node<Integer> part2Head = mid.next;
        mid.next = null;

        part1Head = mergeSort(part1Head);
        part2Head = mergeSort(part2Head);

        return merge(part1Head, part2Head);
    }

    /**
     * Input pattern
     * 1
     * 9 7 5 3 1 2 4 6 8 -1
     * o/p: 1 2 3 4 5 6 7 8 9
     */

    public static void main(String[] args) {
        Node<Integer> head = Node.takeInput();
        head = mergeSort(head);
        Node.printLL(head);
    }
}
