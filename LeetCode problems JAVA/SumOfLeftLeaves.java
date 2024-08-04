public class SumOfLeftLeaves {

    // A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumOfLetLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left != null &&
                root.left.left == null &&
                root.left.right == null) {
            return root.left.val + sumOfLetLeaves(root.right);
        } else {
            return sumOfLetLeaves(root.left) + sumOfLetLeaves(root.right);
        }
    }
}
