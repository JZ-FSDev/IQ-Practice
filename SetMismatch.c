// @author JZ-FSDev
// Runtime: 29 ms, faster than 93.10% of C online submissions for Set Mismatch.

// You have a set of integers s, which originally contains all the numbers from 1 to n. 
// Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
// You are given an integer array nums representing the data status of this set after the error.
// Find the number that occurs twice and the number that is missing and return them in the form of an array.

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
