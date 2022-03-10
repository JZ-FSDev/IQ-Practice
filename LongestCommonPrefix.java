public class LongestCommonPrefix {
    
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        boolean consistent = true;
        if(strs.length > 1){ // if array has more than 1 element
            int index = 0;
            while(consistent){
                if(strs[0].length() > index){
                    prefix += strs[0].charAt(index);
                }
                for(int i = 1; i < strs.length; i++){
                    if(strs[i].length() < index || strs[i].charAt(index) != prefix.charAt(index)){
                        consistent = false;
                        prefix = prefix.substring(0, prefix.length() - 1);
                    }
                }
                index++;
            }
        }
        return prefix;
    }
}
