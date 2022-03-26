import java.util.Stack;

public class ValidParentheses{

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

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
