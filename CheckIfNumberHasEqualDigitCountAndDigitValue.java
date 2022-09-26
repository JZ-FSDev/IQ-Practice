// @author JZ-FSDev
// Runtime: 1 ms, faster than 99.31% of Java online submissions for Check if Number Has Equal Digit Count and Digit Value.

// You are given a 0-indexed string num of length n consisting of digits.
// Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    class Solution {
        public boolean digitCount(String num) {
            int[] arr = new int[10];
            for(int i = 0; i < num.length(); i++){
                arr[num.charAt(i) - 48] ++;
            }
            for(int i = 0; i < num.length(); i++){
                if(arr[i] != num.charAt(i) - 48){
                    return false;
                }
            }
            return true;
        }
    }
}
