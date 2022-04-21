/**
 * Self-written solution for "Maximum Depth of Binary Tree" from LeetCode.
 * Faster than 100.00% of Java online submissions.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class MaximumDepthOfBinaryTree {

    /**
     * Given the root of a binary tree, return its maximum depth.
     * A binary tree's maximum depth is the number of nodes along the longest path
     * from the root node down to the farthest leaf node.
     * 
     * @param root The root of the binary tree.
     * @return The maximum depth of the given binary tree.
     */
    public int maxDepth(TreeNode root) {
        return inOrderTraversal(root) - 1;
    }

    /**
     * Helper method to return the max depth + 1 of the given binary tree.
     * 
     * @param curr The current TreeNode in each recursive call.
     * @return The max depth + 1 of the given binary tree.
     */
    private int inOrderTraversal(TreeNode curr) {
        int left = 1, right = 1;
        if (curr != null) {
            left += inOrderTraversal(curr.left);
            right += inOrderTraversal(curr.right);
        }
        return Math.max(left, right);
    }
}
