public class SameTree {
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result = true;
        if(p != null && q != null){
            if(p.val != q.val){
                return false;
            }else{
                result = isSameTree(p.left, q.left);
                if(result){
                    result = isSameTree(p.right, q.right);
                }

            }
        }else if(p != q){
            return false;
        }
        return result;
    }
}
