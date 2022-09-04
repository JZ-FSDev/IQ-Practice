// @author JZ-FSDev
// Runtime: 2 ms, faster than 45.02% of Java online submissions for Minimum Absolute Difference in BST.

// Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    private ArrayList<Integer> arr = new ArrayList<Integer>();
    
    public int getMinimumDifference(TreeNode root) {
        int diff = Integer.MAX_VALUE;
        inorder(root);
        for(int i = 0; i < arr.size() - 1; i++){
            if(Math.abs(arr.get(i) - arr.get(i + 1)) < diff){
                diff = Math.abs(arr.get(i) - arr.get(i + 1));
            }
        }
        return diff;
    }
    
    public void inorder(TreeNode curr){
        if(curr != null){
            inorder(curr.left);
            arr.add(curr.val);
            inorder(curr.right);
        }
    }
}
