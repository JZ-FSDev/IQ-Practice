// @author JZ-FSDev
// Runtime: 3 ms, faster than 97.03% of C online submissions for Diameter of Binary Tree.

// Given the root of a binary tree, return the length of the diameter of the tree.
// The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
// The length of a path between two nodes is represented by the number of edges between them.

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int max(int a, int b){
    return (a >= b) ? a : b; 
}

int solve(struct TreeNode* root, int *result){
    if(root == NULL) return 0;
    // Immediately skip the root node and not count it to represent accurate edge length
    int leftHeight = solve(root->left, result);
    int rightHeight = solve(root->right, result);
    int temp = 1 + max(leftHeight, rightHeight); // Postorder traversal increment (count while stack collapses)
    *result = max(*result, leftHeight + rightHeight); // Take the longest path from the left and right height at any parent
    return temp;
}


int diameterOfBinaryTree(struct TreeNode* root){
    int result = INT_MIN;
    solve(root, &result);
    return result;
}

