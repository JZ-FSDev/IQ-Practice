public class CountAsterisks {
    class Solution {
        public int countAsterisks(String s) {
            int count = 0;
            int status = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '|'){
                    status++;
                }
                if(s.charAt(i) == '*' && status % 2 == 0){
                    count++;
                }
            }
            return count;
        }
    }
}
