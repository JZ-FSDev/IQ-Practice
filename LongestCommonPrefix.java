 /**
 * Self-written solution for "Longest Common Prefix" from LeetCode.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class LongestCommonPrefix {
    
    public static void main(String[] args) {
        // Test the method
        String[] s = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(s));
    }

    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     * 
     * @param strs The array of Strings to have the longest common prefix determined.
     * @return The longest common prefix of all the Strings in the specified String array.
     */
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        boolean consistent = true;
        if(strs.length > 1){ // if array has more than 1 element
            int index = 0;
            while(consistent){
                for(int i = 0; i < strs.length && consistent; i++){
                    if(strs[i].length() <= index){ // if not too short
                        consistent = false;
                        if(prefix.length() != 0 && i != 0){
                            prefix = prefix.substring(0, prefix.length() - 1);
                        }
                    }else{ // at least long enough
                        if(i == 0){ // add character of first word
                            prefix += strs[i].charAt(index);
                        }else if(strs[i].charAt(index) != prefix.charAt(index)){
                            consistent = false;
                            prefix = prefix.substring(0, prefix.length() - 1);
                        }
                    }
                }
                index ++;
            }
        }else if(strs.length == 1){
            prefix = strs[0];
        }
        return prefix;
    }
}
