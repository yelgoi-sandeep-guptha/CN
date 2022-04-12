package M3.L24;

import java.util.Scanner;

public class IsNodePresent {

    private static boolean isNodePresent(BTNode root, int x) {
        if (root == null) {
            return false;
        }
        if (root.data == x) {
            return true;
        }

        boolean ans = isNodePresent(root.left, x);
        if (ans) {
            return true;
        }
        return isNodePresent(root.right, x);
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Node to search : ");
        int x = s.nextInt();
        if (isNodePresent(root, x)) {
            System.out.print(x + " is Present in the Binary Tree. ");
        } else {
            System.out.print(x + " is Not Present in the Binary Tree. ");
        }
        s.close();
    }
}
