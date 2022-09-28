// @author JZ-FSDev
// Runtime: 1 ms, faster than 92.46% of Java online submissions for Rearrange Characters to Make Target String.

// You are given two 0-indexed strings s and target. You can take some letters from s and rearrange them to form new strings.
// Return the maximum number of copies of target that can be formed by taking letters from s and rearranging them.

public class RearrangeCharactersToMakeTargetString {
    class Solution {
        public int rearrangeCharacters(String s, String target) {
            int[] alpha = new int[26];
            int count = 0;
            for(int i = 0; i < s.length(); i++){
                alpha[s.charAt(i) - 97]++;
            }
            boolean cont = true;
            int index = 0;
            
            while(cont){
                for(int i = 0; i < target.length(); i++){
                    index = target.charAt(i) - 97;
                    if(alpha[index] <= 0){
                        cont = false;
                        break;
                    }else{
                        alpha[index]--;
                    }
                }
                if(cont){
                    count++;
                }
            }
            return count;
        }
    }
}
