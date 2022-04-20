/**
 * Self-written solution of "Invert Binary Tree" from LeetCode.
 * Faster than 100.00% of Java online submissions.
 * Less than 76.24% of Java online submissions.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class InvertBinaryTree {

    /**
     * Given the root of a binary tree, invert the tree, and return its root.
     * 
     * @param root The root of the binary tree.
     * @return The root of the binary tree post inversion.
     */
    public TreeNode invertTree(TreeNode root) {
        invertTreeHelper(root);
        return root;
    }

    /**
     * Helper method to invert a given binary tree of its root.
     * 
     * @param root The root of the binary tree to invert.
     */
    private void invertTreeHelper(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
    }
}
