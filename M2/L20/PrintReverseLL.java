package M2.L20;

public class PrintReverseLL {

    public static void reverseIterative(Node<Integer> head) {
        if (head == null) {
            return;
        }
        reverseIterative(head.next);
        System.out.print(head.data + " ");
    }

    public static void reverseRecursive(Node<Integer> head) {
        if (head == null) {
            return;
        }
        int length = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        for (int i = 0; i < length; i++) {
            int count = 0;
            temp = head;
            while (count < length - i - 1) {
                temp = temp.next;
                count++;
            }
            System.out.print(temp.data + " ");
        }
    }

    /**
     * Input Pattern
     * testcases
     * Enter elements into the LinkedList ,end with -1
     */
    
    public static void main(String[] args) {
        Node<Integer> head = NodeTemplate.takeInput();
        reverseRecursive(head);
    }
}
