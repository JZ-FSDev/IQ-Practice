/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int maxInt(int a, int b){
    return a > b ? a : b;
}

void solve(struct TreeNode* root, int *arr, int *max){
    if(root){
        if(arr[root->val + 100000] == -1){
            arr[root->val + 100000] = 1;
        }else{
            arr[root->val + 100000] += 1;
        }
        *max = maxInt(*max, arr[root->val + 100000]);
        solve(root->left, arr, max);
        solve(root->right, arr, max);
    }
}


/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findMode(struct TreeNode* root, int* returnSize){
    int arr[200001];
    for(int i = 0; i < 200001; i++){
        arr[i] = -1;
    }
    int max = -1;
    solve(root, arr, &max);
    int count = 0;
    int *ptr = malloc(sizeof(int) * 200001);
    for(int i = 0; i < 200001; i++){
        if(arr[i] == max){
            ptr[count] = i - 100000;
            count++;
        }
    }
    *returnSize = count;
    return ptr;
}
