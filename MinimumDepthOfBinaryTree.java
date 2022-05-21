import java.util.LinkedList;
import java.util.Queue;

/**
 * Self-written solution of "Merge Two Sorted Lists" from LeetCode.
 * Faster than 95.55% of Java online submissions.
 * 
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class MinimumDepthOfBinaryTree {

    /**
     * Given a binary tree, find its minimum depth.
     * 
     * The minimum depth is the number of nodes along the shortest path from the
     * root node down to the nearest leaf node.
     * 
     * Note: A leaf is a node with no children.
     * 
     * @param root The root of the tree to compute the min depth.
     * @return The minimum depth of the tree to reach a leaf from the root.
     */
    public int minDepth(TreeNode root) {
        int depth = 1;
        if (root == null) {
            depth = 0;
        } else {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            boolean terminate = false;
            while (!q.isEmpty() && !terminate) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    if (curr.left == null && curr.right == null && !terminate) {
                        terminate = true;
                        depth--;
                    }
                    if (curr.left != null) {
                        q.offer(curr.left);
                    }
                    if (curr.right != null) {
                        q.offer(curr.right);
                    }
                }
                depth++;
            }
        }
        return depth;
    }

}
