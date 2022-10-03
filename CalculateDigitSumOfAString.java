// @author JZ-FSDev
// Runtime: 6 ms, faster than 37.82% of Java online submissions for Calculate Digit Sum of a String.

// You are given a string s consisting of digits and an integer k.
// A round can be completed if the length of s is greater than k. In one round, do the following:
// Divide s into consecutive groups of size k such that the first k characters are in the first group, the next k characters are in the second group, and so on. Note that the size of the last group can be smaller than k.
// Replace each group of s with a string representing the sum of all its digits. For example, "346" is replaced with "13" because 3 + 4 + 6 = 13.
// Merge consecutive groups together to form a new string. If the length of the string is greater than k, repeat from step 1.
// Return s after all rounds have been completed.

public class CalculateDigitSumOfAString {
    class Solution {
        public String digitSum(String s, int k) {
            while(s.length() > k){
                s = process(s, k);
            }
            return s;
        }
        
        public String process(String s, int k){
            String res = "";
            while(s.length() > 0){
                int sum = 0;
                if(s.length() > k){
                    for(int i = 0; i < k; i++){
                        sum += (s.charAt(i) - 48);
                    }
                    s = s.substring(k, s.length());
                }else{
                    for(int i = 0; i < s.length(); i++){
                        sum += (s.charAt(i) - 48);
                    }
                    s = "";
                }
                res += sum;
            }
            return res;
        }    
    }
}
