public class MinimumDepthOfBinaryTree{

    public int minDepth(TreeNode root) {
        Integer min = new Integer(Integer.MAX_VALUE);
        minDepth(root, min);
        return min.intValue();
    }
    
    public int minDepth(TreeNode root, Integer minDepth){
        int node = 1;
        if(root != null){
            if(root.left == null && root.right == null && node < minDepth.intValue()){
                minDepth = node;
            }
            node += minDepth(root.left, minDepth);
            node += minDepth(root.right, minDepth);
        }
        return node;
    }

}
