package M3.L24;

public class SumOfNodes {

    private static int sumOfNodes(BTNode root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        int sum = sumOfNodes(root);
        System.out.println("The Sum of Nodes in the Binary Tree : " + sum);
    }
}
