 /**
 * Solution-assisted recursive solution of "Regular Expression Matching" from LeetCode.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class RegularExpressionMatching {

    public static void main(String[] args) {
        // Test the method
        String s = "aa", p = "a*";
        System.out.println(isMatch(s, p));
    }

    /**
     * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
     * '.' Matches any single character. '*' Matches zero or more of the preceding element.
     * The matching should cover the entire input string (not partial).
     * 
     * @param toMatch The String to match to the specified pattern.
     * @param pattern The String pattern to match to the specified String.
     * @return True if the specified String matches the specified String pattern.
     */
    public static boolean isMatch(String toMatch, String pattern) {
        if (pattern.isEmpty())
            return toMatch.isEmpty();
        boolean firstMatch = (!toMatch.isEmpty() && // String to match is not empty and characters at first place match
                (pattern.charAt(0) == toMatch.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*') { // if star encountered on second index and pattern is longer than 2
            return (isMatch(toMatch, pattern.substring(2)) || // everything after the star in pattern matches String to match
                    (firstMatch && isMatch(toMatch.substring(1), pattern))); // next character of the String to match
                                                                       // matches the first character of the pattern 
                                                                       // (character before the star)
        } else {
            return firstMatch && isMatch(toMatch.substring(1), pattern.substring(1)); // check the next part of the string one
                                                                                // character to
                                                                                // the right
        }
    }
}
