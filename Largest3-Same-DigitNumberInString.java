public class Largest3-Same-DigitNumberInString {
    class Solution {
        public String largestGoodInteger(String num) {
            String ret = "";
            char sub = 'a';
            boolean repeat = true;
            for(int i = 0; i < num.length() - 2; i++){
                sub = num.charAt(i);
                for(int j = i + 1; j < num.length() && j <= i + 2; j++){
                    if(num.charAt(j) != sub){
                        repeat = false;
                        if(i == num.length() - 3){
                            return "";
                        }
                        break;
                    }
                }
                if(repeat){
                    break;
                }else{
                    repeat = true;
                }
            }
            if(repeat){
                ret += sub;
                ret += sub;
                ret += sub;
            }
            return ret;
        }
    }
}
