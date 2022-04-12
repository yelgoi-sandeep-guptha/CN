package M3.L24;

public class LargestNode {

    private static int largest(BTNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(root.data, Math.max(largest(root.left), largest(root.right)));
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        System.out.println("The largest Data in the Binary Tree : " + largest(root));
    }
}
