public class PathSum {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {

        boolean res = false;

        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root != null) {
                traverse(root, 0, targetSum);
            }
            return res;
        }

        public void traverse(TreeNode root, int curr, int targetSum) {
            if (root != null) {
                if (root.val + curr == targetSum && root.left == null && root.right == null) {
                    res = true;
                    return;
                } else {
                    traverse(root.left, curr + root.val, targetSum);
                    traverse(root.right, curr + root.val, targetSum);
                }
            }
        }
    }
}
