package M3.L24;

public class Height {

    private static int height(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        System.out.println("The Height of Binary Tree is : " + height(root));
    }
}
