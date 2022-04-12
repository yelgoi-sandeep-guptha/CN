package M3.L24;

public class ReplaceNodeWithDepth {

    private static void replace(BTNode root, int k) {
        if (root == null) {
            return;
        }
        root.data = k;
        replace(root.left, k + 1);
        replace(root.right, k + 1);
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        replace(root, 0);
        System.out.println("The Elements after replacing the node Values with depth : ");
        BTNode.printNodes(root);
    }
}
