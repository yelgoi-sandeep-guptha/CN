package M3.L24;

public class TreeTraversals {

    private static void preOrder(BTNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(BTNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    private static void postOrder(BTNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        System.out.print("PreOrder Traversal : ");
        preOrder(root);
        System.out.println();
        System.out.print("InOrder Traversal : ");
        inOrder(root);
        System.out.println();
        System.out.print("PostOrder Traversal : ");
        postOrder(root);
    }
}
