// @author JZ-FSDev
// Runtime: 3 ms, faster than 25.24% of Java online submissions for Min Max Game.

// You are given a 0-indexed integer array nums whose length is a power of 2.

// Apply the following algorithm on nums:

// Let n be the length of nums. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n / 2.
// For every even index i where 0 <= i < n / 2, assign the value of newNums[i] as min(nums[2 * i], nums[2 * i + 1]).
// For every odd index i where 0 <= i < n / 2, assign the value of newNums[i] as max(nums[2 * i], nums[2 * i + 1]).
// Replace the array nums with newNums.
// Repeat the entire process starting from step 1.
// Return the last number that remains in nums after applying the algorithm.

public class MinMaxGame {
    class Solution {
        public int minMaxGame(int[] nums) {
            while(nums.length > 1){
                int[] temp = new int[nums.length / 2];
                for(int i = 0; i < temp.length; i++){
                    if(i % 2 == 0){ // even
                        temp[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                    }else{ // odd
                        temp[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                    }
                }
                nums = temp;
            }
            return nums[0];
        }
    }
}
