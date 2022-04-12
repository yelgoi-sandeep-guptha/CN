package M3.L24;

import java.util.Scanner;

public class CountNodesGreaterThanX {

    private static int countNodes(BTNode root, int x) {
        if (root == null) {
            return 0;
        }
        int count = root.data > x ? 1 : 0;
        if (root.left != null) {
            count += countNodes(root.left, x);
        }
        if (root.right != null) {
            count += countNodes(root.right, x);
        }
        return count;
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x value : ");
        int x = s.nextInt();
        System.out.println("The Total Number of Nodes greater than X : " + countNodes(root, x));
        s.close();
    }
}
