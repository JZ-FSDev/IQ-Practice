 /**
 * Self-written solution of "Palindrome Number" from LeetCode.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class PalindromeNumber {
    
    public static void main(String[] args) {
        // Test the method
        System.out.println(isPalindrome(010));
    }

    /**
     * Given an integer x, return true if x is palindrome integer.
     * An integer is a palindrome when it reads the same backward as forward.
     * 
     * @param x The int to check if it is a palindrome.
     * @return Returns true if the specified int is a palindrome.
     */
    public static boolean isPalindrome(int x) {
        boolean result = true;
        if(x < 0){
            result = false;
        }else{
            int start = 0, end = (int) Math.log10(x);
            while(result && start <= end){
                if((int)(x / Math.pow(10, start++) % 10) != (int)(x / Math.pow(10, end--) % 10)){
                    result = false;
                }
            }
        }
        return result;
    }
}
