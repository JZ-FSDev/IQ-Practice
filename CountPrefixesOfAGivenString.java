// @author JZ-FSDev
// Runtime: 2 ms, faster than 43.63% of Java online submissions for Count Prefixes of a Given String.

// You are given a string array words and a string s, where words[i] and s comprise only of lowercase English letters.
// Return the number of strings in words that are a prefix of s.
// A prefix of a string is a substring that occurs at the beginning of the string. A substring is a contiguous sequence of characters within a string.

public class CountPrefixesOfAGivenString {
    class Solution {
        public int countPrefixes(String[] words, String s) {
            int count = 0;
            boolean res = true;
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() <= s.length()) {  // optimization to prevent checking if prefix is longer than string itself
                    for (int j = 0; j < words[i].length(); j++) {
                        if (words[i].charAt(j) != s.charAt(j)) {
                            res = false;
                            break;
                        }
                    }
                    if (res) {
                        count++;
                    }
                    res = true;
                }
            }
            return count;
        }
    }
}
