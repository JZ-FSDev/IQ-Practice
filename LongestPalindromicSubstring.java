public class LongestPalindromicSubstring {
    
    public static void main(String[] args) {
        String s = "";
        System.out.println(longestPalindrome(s));
    }

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
