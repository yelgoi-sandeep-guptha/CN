package M2.L21;

import java.util.Scanner;

import M2.Node;

public class SkipMDeleteN {

    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        if (M == 0 || head == null || N == 0) {
            return head;
        }

        Node<Integer> currNode = head;
        Node<Integer> temp = null;

        while (currNode != null) {
            int skip = 0;
            int take = 0;

            while (currNode != null && take < M) {
                if (temp == null) {
                    temp = currNode;
                } else {
                    temp.next = currNode;
                    temp = currNode;
                }
                currNode = currNode.next;
                take++;
            }
            while (currNode != null && skip < N) {
                currNode = currNode.next;
                skip++;
            }
        }

        if (temp != null) {
            temp.next = null;
        }
        return head;
    }

    /**
     * Input pattern
     * skip(M) delete(N)
     * Enter Elements -1
     * 2 2
     * 1
     * 1 2 3 4 5 6 7 8 -1
     * o/p 1 2 5 6
     * 
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int M = s.nextInt();
        int N = s.nextInt();
        Node<Integer> head = Node.takeInput();
        head = skipMdeleteN(head, M, N);
        Node.printLL(head);
        s.close();
    }
}
