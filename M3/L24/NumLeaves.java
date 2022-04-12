package M3.L24;

public class NumLeaves {

    private static int numLeaves(BTNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return numLeaves(root.left) + numLeaves(root.right);
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        System.out.println("The Number of leaf Nodes in the Binary Tree : " + numLeaves(root));
    }
}
