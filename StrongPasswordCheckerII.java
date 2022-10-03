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
