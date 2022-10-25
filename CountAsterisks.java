// @author JZ-FSDev
// Runtime: 3 ms, faster than 66.36% of Java online submissions for Count Asterisks.

// You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair. In other words, the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.

// Return the number of '*' in s, excluding the '*' between each pair of '|'.

// Note that each '|' will belong to exactly one pair.
public class CountAsterisks {
    class Solution {
        public int countAsterisks(String s) {
            int count = 0;
            int status = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '|'){
                    status++;
                }
                if(s.charAt(i) == '*' && status % 2 == 0){
                    count++;
                }
            }
            return count;
        }
    }
}
