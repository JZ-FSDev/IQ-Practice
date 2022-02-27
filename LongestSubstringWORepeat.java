 /**
 * Self-written solution for "Longest Substring Without Repeating Characters" from LeetCode.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class LongestSubstringWORepeat {
    
    public static void main(String[] args) {
        // Test the method
        int length = lengthOfLongestSubstring("abcabcbb");
        System.out.println(length);
    }

    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     * 
     * @param s The string to find the length of the longest substring without repeats.
     * @return The length of the longest substring.
     */
    public static int lengthOfLongestSubstring(String s) {
        char[] temp = new char[s.length()];
        int count = 1;
        if(s == null || s.length() == 0){
           return 0; 
        }else{
            for(int i = 0; i < s.length(); i++){
                temp[i] = s.charAt(i);
                int tempCount = 1;
                boolean found = false;
                for(int j = i + 1; j < s.length() && !found; j++){
                    for(int k = 0; k < temp.length && !found; k++){
                        if(temp[k] == s.charAt(j)){
                            found = true;
                        }
                    }
                    if(!found){
                        temp[j] = s.charAt(j);
                        tempCount++;
                    }
                }
                if(tempCount > count){
                    count = tempCount;
                }
                temp = new char[s.length()];
            }
        }
        return count;
    }
}
