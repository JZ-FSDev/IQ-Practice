/**
 * Self-written solution of "Same Tree" from LeetCode.
 * Faster than 100.00% of Java online submissions.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class SameTree {

    /**
     * Given the roots of two binary trees p and q, write a function to check if
     * they are the same or not.
     * 
     * Two binary trees are considered the same if they are structurally identical,
     * and the nodes have the same value.
     * 
     * @param p The root of the first binary tree.
     * @param q The root of the second binary tree.
     * @return True if the two binary trees are identical.
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result = true;
        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            } else {
                result = isSameTree(p.left, q.left);
                if (result) {
                    result = isSameTree(p.right, q.right);
                }

            }
        } else if (p != q) {
            return false;
        }
        return result;
    }
}
