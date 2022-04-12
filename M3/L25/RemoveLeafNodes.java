package M3.L25;

import M3.L24.BTNode;

public class RemoveLeafNodes {

    private static BTNode removeLeaves(BTNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        root = removeLeaves(root);
        System.out.println("Nodes After Removing leaves : ");
        BTNode.printNodes(root);
    }
}
