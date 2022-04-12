import java.util.Stack;

 /**
 * Self-written solution of "Valid Parentheses" from LeetCode.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class ValidParentheses{

    public static void main(String[] args) {
        // Test the method
        System.out.println(isValid("()"));
    }

    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
     * determine if the input string is valid.
     * 
     * An input string is valid if:
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * 
     * @param s The String to be checked for validity.
     * @return Returns true if the given String contains a valid set of parentheses.
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        boolean valid = s.length() > 1;

        for(int i = 0; i < s.length() && valid; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    valid = false;
                }else if(s.charAt(i) == ')'){
                    if(stack.pop() != '('){
                        valid = false;
                    }
                }else if(s.charAt(i) == ']'){
                    if(stack.pop() != '['){
                        valid = false;
                    }
                }else if(s.charAt(i) == '}'){
                    if(stack.pop() != '{'){
                        valid = false;
                    }
                }
            }
        }
        if(!stack.empty()){
            valid = false;
        }
        return valid;
    }

}
