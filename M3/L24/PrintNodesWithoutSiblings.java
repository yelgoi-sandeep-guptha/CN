package M3.L24;

public class PrintNodesWithoutSiblings {

    private static void print(BTNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null && root.right == null) {
            System.out.print(root.data + " ");
        }
        if (root.left == null && root.right != null) {
            System.out.print(root.data + " ");
        }
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        System.out.println("Nodes without Siblings are : ");
        print(root);
    }
}
