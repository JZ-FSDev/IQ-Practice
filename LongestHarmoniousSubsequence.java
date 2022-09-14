// @author JZ-FSDev
// Runtime: 1476 ms, faster than 5.06% of Java online submissions for Longest Harmonious Subsequence.

// We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
// Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
// A subsequence of array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int len = 0;
        int temp;
        int count;
        for(int i = 0; i < nums.length; i++){
            temp = 2;
            count = 0;
            for(int j = i + 1; j < nums.length; j++){
                if(count >= 2 && nums[i] == nums[j]){
                    count++;
                }else if(nums[i] == nums[j]){
                    count = 2;
                    temp--;
                }
                if(Math.abs(nums[j] - nums[i]) == 1){
                    for(int k = j + 1; k < nums.length; k++){
                        if(nums[k] == nums[j]){
                            temp++;
                        }
                    }
                    if(temp + count > len){
                        len = temp + count;
                    }
                    break;
                }    
            }

        }
        return len;
    }
}
