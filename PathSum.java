// @author JZ-FSDev
// Runtime: 1 ms, faster than 64.39% of Java online submissions for Path Sum.

// Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
// A leaf is a node with no children.
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
