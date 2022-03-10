 /**
 * Self-written solution for "Roman to Integer" from LeetCode.
 * (Faster than 75% of Java submissions).
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class RomanToInteger {

    public static void main(String[] args) {
        // Test the method
        System.out.println(romanToInt("DCXXI"));
    }

    /**
     * Roman numerals are usually written largest to smallest from left to right.
     * However, the numeral for four is not IIII. Instead, the number four is
     * written as IV. Because the one is before the five we subtract it making four.
     * The same principle applies to the number nine, which is written as IX. There
     * are six instances where subtraction is used:
     * 
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * 
     * Given a roman numeral, convert it to an integer.
     * 
     * @param s The specified Roman numeral String to convert to number form.
     * @return The number form of the specified Roman numeral String.
     */
    public static int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' && i + 1 < s.length()) {
                if (s.charAt(i + 1) == 'V') {
                    num += 4;
                    i++;
                } else if (s.charAt(i + 1) == 'X') {
                    num += 9;
                    i++;
                } else {
                    num += 1;
                }
            } else if (s.charAt(i) == 'X' && i + 1 < s.length()) {
                if (s.charAt(i + 1) == 'L') {
                    num += 40;
                    i++;
                } else if (s.charAt(i + 1) == 'C') {
                    num += 90;
                    i++;
                } else {
                    num += 10;
                }
            } else if (s.charAt(i) == 'C' && i + 1 < s.length()) {
                if (s.charAt(i + 1) == 'D') {
                    num += 400;
                    i++;
                } else if (s.charAt(i + 1) == 'M') {
                    num += 900;
                    i++;
                } else {
                    num += 100;
                }
            } else {
                if (s.charAt(i) == 'I') {
                    num += 1;
                } else if (s.charAt(i) == 'V') {
                    num += 5;
                } else if (s.charAt(i) == 'X') {
                    num += 10;
                } else if (s.charAt(i) == 'L') {
                    num += 50;
                } else if (s.charAt(i) == 'C') {
                    num += 100;
                } else if (s.charAt(i) == 'D') {
                    num += 500;
                } else if (s.charAt(i) == 'M') {
                    num += 1000;
                }
            }
        }
        return num;
    }
}
