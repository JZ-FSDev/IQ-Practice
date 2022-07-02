// @author JZ-FSDev
// Runtime: 47 ms, faster than 82.46% of C online submissions for Max Consecutive Ones.

// Given a binary array nums, return the maximum number of consecutive 1's in the array.
int findMaxConsecutiveOnes(int* nums, int numsSize){
    int max = 0;
    int temp = 0;
    int i = 0;
    for(i = 0; i < numsSize; i++){
        if(nums[i] == 0){
            if(i - temp > max){
                max = i - temp;
            }
            temp = i + 1;
        }
    }
    if(i - temp > max){
        max = i - temp;
    }
    return max;
}
