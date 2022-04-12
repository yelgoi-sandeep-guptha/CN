package M3.L25;

import M3.L24.BTNode;

public class MirrorBT {

    private static void mirror(BTNode root) {
        if (root == null) {
            return;
        }
        BTNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        System.out.println("Elements Before Mirroring : ");
        BTNode.printNodes(root);
        System.out.println();
        mirror(root);
        System.out.println("Binary Tree After Mirroring : ");
        BTNode.printNodes(root);
    }
}
