package M3.L24;

public class NoOfNodes {

    private int numNodes(BTNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + numNodes(root.left) + numNodes(root.right);
    }

    public static void main(String[] args) {
        BTNode root = BTNode.takeInputDetail();
        NoOfNodes obj = new NoOfNodes();
        int count = obj.numNodes(root);
        System.out.println("The Total Number of Nodes present in the tree is : " + count);
    }
}
