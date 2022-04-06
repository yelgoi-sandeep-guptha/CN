package M2.L20;

public class EliminateDuplicates {

    public static Node<Integer> removeDuplicatesIterative(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> currNode = head;

        while (currNode.next != null) {
            if (currNode.data.equals(currNode.next.data)) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
        return head;
    }

    public static Node<Integer> removeDuplicatesRecursive(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> smallHead = removeDuplicatesRecursive(head.next);

        if (smallHead.data.equals(head.data)) {
            return smallHead;
        }
        head.next = smallHead;
        return head;
    }

    /**
     * Input Pattern
     * testcases
     * Enter elements into the LinkedList in sorting order, end with -1
     */

    public static void main(String[] args) {
        Node<Integer> head = NodeTemplate.takeInput();
        head = removeDuplicatesRecursive(head);
        NodeTemplate.printLL(head);
    }
}
