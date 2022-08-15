

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findErrorNums(int* nums, int numsSize, int* returnSize){
    int arr[numsSize];
    int num1 = 0;
    int num2 = 0;
    for(int i = 0; i < numsSize; i++){
        arr[i] = -1;
    }
    int *ret = malloc(sizeof(int) * 2);
    for(int i = 0; i < numsSize; i++){
        if(arr[nums[i] -1] == 1){
            arr[nums[i] - 1] = 2;
        }else{
            arr[nums[i] -1] = 1;
        }

    }
    for(int i = 0; i < numsSize; i++){
        if(arr[i] == 2){
            num1 = i + 1;
        }else if(arr[i] == -1){
            num2 = i + 1;
        }
    }
    ret[0] = num1;
    ret[1] = num2;
    *returnSize = 2;
    return ret;
}
