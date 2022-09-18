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
