package M3.L24;

import java.util.Scanner;

public class PrintAtDepthK {

    private static void print(BTNode root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.data + " ");
            return;
        }
        print(root.left, k - 1);
        print(root.right, k - 1);
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter k value : ");
        int k = s.nextInt();
        System.out.println("Values at depth k are : ");
        print(root, k);
        s.close();
    }
}
