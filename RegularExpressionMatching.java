public class RegularExpressionMatching {

    public static void main(String[] args) {
        String s = "aa", p = "a*";
        System.out.println(isMatch(s, p));
    }

    public static boolean isMatch(String toMatch, String p) {
        if (p.isEmpty())
            return toMatch.isEmpty();
        boolean firstMatch = (!toMatch.isEmpty() && // String to match is not empty and characters at first place match
                (p.charAt(0) == toMatch.charAt(0) || p.charAt(0) == '.'));

        if (p.length() >= 2 && p.charAt(1) == '*') { // if star encountered on second index and pattern is longer than 2
            return (isMatch(toMatch, p.substring(2)) || // everything after the star in pattern matches String to match
                    (firstMatch && isMatch(toMatch.substring(1), p))); // next character of the String to match
                                                                       // matches the first character of the pattern 
                                                                       // (character before the star)
        } else {
            return firstMatch && isMatch(toMatch.substring(1), p.substring(1)); // check the next part of the string one
                                                                                // character to
                                                                                // the right
        }
    }
}
