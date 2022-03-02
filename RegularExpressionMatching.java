public class RegularExpressionMatching {
    
    public static void main(String[] args) {
        String s = "aa", p = "a*";
        System.out.println(isMatch(s, p));
    }

    public static boolean isMatch(String s, String p) {
        boolean matching = true;
        if(s.length() != p.length()){
            matching = false;
        }else{
            for(int i = 0; i < s.length() && matching; i++){
                if(s.charAt(i) != p.charAt(i)){
                    if(p.charAt(i) == '*' && p.charAt(i - 1) != s.charAt(i)){
                        matching = false;
                    }else if(p.charAt(i) == '*' && p.charAt(i - 1) != '.'){
                        matching = false;
                    }
                }
            }
        }
        return matching;
    }
}
