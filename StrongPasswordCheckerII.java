// @author JZ-FSDev
// Runtime: Runtime: 1 ms, faster than 98.05% of Java online submissions for Strong Password Checker II.

// A password is said to be strong if it satisfies all the following criteria:

// It has at least 8 characters.
// It contains at least one lowercase letter.
// It contains at least one uppercase letter.
// It contains at least one digit.
// It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
// It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).
// Given a string password, return true if it is a strong password. Otherwise, return false.

public class StrongPasswordCheckerII {
    class Solution {
        public boolean strongPasswordCheckerII(String password) {
            boolean lower = false, upper = false, digit = false, special = false, adj = false;
            for(int i = 0; i < password.length(); i++){
                if(password.charAt(i) >= 97 && password.charAt(i) <= 122){
                    lower = true;
                }else if(password.charAt(i) >= 65 && password.charAt(i) <= 90){
                    upper = true;
                }else if(password.charAt(i) >= 48 && password.charAt(i) <= 57){
                    digit = true;
                }else if(password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '^' || password.charAt(i) == '&' || password.charAt(i) == '*' || password.charAt(i) == '(' || password.charAt(i) == ')' || password.charAt(i) == '-' || password.charAt(i) == '+'){
                    special = true;
                }
                if(i < password.length() - 1 && password.charAt(i) == password.charAt(i + 1)){
                    adj = true;
                }
            }
            return (lower && upper && digit && special && !adj && password.length() >= 8);
        }
    }
}
