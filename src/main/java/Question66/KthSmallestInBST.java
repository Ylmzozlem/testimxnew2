package Question66;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class KthSmallestInBST {
    private int count = 0;
    private int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k);
        return result;
    }

    private void inorderTraversal(TreeNode node, int k) {
        if (node == null || count >= k) {
            return;
        }

        inorderTraversal(node.left, k);
        count++;
        if (count == k) {
            result = node.val;
            return;
        }
        inorderTraversal(node.right, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int k = 1;

        KthSmallestInBST solution = new KthSmallestInBST();
        int kthSmallest = solution.kthSmallest(root, k);
        System.out.println("Kth smallest element: " + kthSmallest);
    }
}
