import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree{

    public int minDepth(TreeNode root) {
        int depth = 1;
        if (root == null) {
            depth = 0;
        }else{
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            boolean terminate = false;
            while (!q.isEmpty() && !terminate) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    if (curr.left == null && curr.right == null && !terminate) {
                        terminate = true;
                        depth --;
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
