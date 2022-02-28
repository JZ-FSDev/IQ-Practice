 /**
 * Self-written solution of "Longest Palindromic Substring" from LeetCode.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class LongestPalindromicSubstring {
    
    public static void main(String[] args) {
        // Test the method
        String s = "asdsa";
        System.out.println(longestPalindrome(s));
    }

    /**
     * Given a string s, return the longest palindromic substring in s.
     * 
     * @param s The String to check for the longest palindrome substring.
     * @return Returns the longest palindrome substring of the specified String.
     */
    public static String longestPalindrome(String s) {
        String ans = "";

        if(s != null && s.length() > 1){
            for(int i = 0; i < s.length(); i++){
                for(int j = i; j < s.length(); j++){
                    String sub = s.substring(i, j + 1);
                    if(palindrome(sub) && sub.length() > ans.length()){
                        ans = sub;
                    }
                }
            }
        }else if(s != null && s.length() == 1){
            ans = s;
        }
        return ans;
    }

    /**
     * Returns true if the specified String is a palindrome.
     * 
     * @param s The String to be checked if it is a palindrome.
     * @return Returns true if the specified String is a palindrome.
     */
    private static boolean palindrome(String s){
        int start = 0, end = s.length()-1;
        boolean result = true;

        while(result && start <= end){
            if(s.charAt(start++) != s.charAt(end--)){
                result = false;
            }
        }
        return result;
    }
}
