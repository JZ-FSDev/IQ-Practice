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
    int leftHeight = solve(root->left, result);
    int rightHeight = solve(root->right, result);
    int temp = 1 + max(leftHeight, rightHeight);
    *result = max(*result, leftHeight + rightHeight);
    return temp;
}


int diameterOfBinaryTree(struct TreeNode* root){
    int result = INT_MIN;
    solve(root, &result);
    return result;
}

