 /**
 * Self-written "Two Sum" from LeetCode solution.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class TwoSum {

    public static void main(String[] args) {
        // Test the method
        int[] nums = {3,3};
        int[] ans = twoSum(nums, 6);
        System.out.println(ans[0] + " " + ans[1]);
    }

    /**
     * Given an array of integers nums and an integer target, return indices of the
     * two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may
     * not use the same element twice.
     * 
     * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     * 
     * @param nums Array to find two numbers which add to the specified target.
     * @param target The target sum.
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
