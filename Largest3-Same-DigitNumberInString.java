// @author JZ-FSDev
// Runtime: 12 ms, faster than 22.11% of Java online submissions for Largest 3-Same-Digit Number in String.

// You are given a string num representing a large integer. An integer is good if it meets the following conditions:
// - It is a substring of num with length 3.
// - It consists of only one unique digit.
// Return the maximum good integer as a string or an empty string "" if no such integer exists.

public class Largest3-Same-DigitNumberInString {
    class Solution {
        public String largestGoodInteger(String num) {
            String ret = "";
            char sub = '0';
            boolean found = false;
            for(int i = 2; i < num.length(); i++){
                if(num.charAt(i - 1) == num.charAt(i) && num.charAt(i - 1) == num.charAt(i - 2)){
                    if(num.charAt(i - 1) > sub){
                        sub = num.charAt(i - 1);
                    }
                    found = true;
                }
            }
            if(found){
                ret += sub;
                ret += sub;
                ret += sub;
            }
            return ret;
        }
    }
}
