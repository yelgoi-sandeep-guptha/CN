package M2.L20;

public class PalindromeLL {

    public static Node<Integer> reverse(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> temp = reverse(head.next);
        Node<Integer> tail = head.next;
        tail.next = head;
        head.next = null;
        return temp;
    }

    public static boolean isPalindrome(Node<Integer> head) {
        if (head == null || head == null) {
            return true;
        }

        // Divide the linkedList into two equal halves
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node<Integer> firstHead = head;
        Node<Integer> secondHead = slow.next;
        // reverse the secondHalf
        secondHead = reverse(secondHead);
        slow.next = null;

        // Compare two lists
        while (secondHead != null && firstHead != null) {
            if (!firstHead.data.equals(secondHead.data)) {
                return false;
            }
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }
        return true;
    }

    /**
     * Input Format
     * testcases
     * Enter Elements into the LinkedList, end with -1
     */

    public static void main(String[] args) {
        Node<Integer> head = NodeTemplate.takeInput();
        if (isPalindrome(head)) {
            System.out.println("The LinkedList is Palindrome ");
        } else {
            System.out.println("The LinkedList is not Palindrome ");
        }
    }
}
