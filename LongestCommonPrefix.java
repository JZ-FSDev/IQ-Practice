public class LongestCommonPrefix {
    
    public static void main(String[] args) {
        String[] s = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(s));
    }

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
