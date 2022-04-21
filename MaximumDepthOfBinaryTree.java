public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return inOrderTraversal(root) - 1;
    }
    
    private int inOrderTraversal(TreeNode curr){
        int left = 1, right = 1;
        if(curr != null){
            left += inOrderTraversal(curr.left);
            right += inOrderTraversal(curr.right);
        }
        return Math.max(left, right);
    }
}
