public class DecodeTheMessage {
    class Solution {
        public String decodeMessage(String key, String message) {
            StringBuilder s = new StringBuilder();
            HashMap<String, String> dict = new HashMap<String, String>();
            int pos = 0;
            for(int i = 0; i < key.length() && dict.size() < 26; i++){
                if(dict.get("" + key.charAt(i)) == null){
                    dict.put("" + key.charAt(i), "" + ((char)('a' + pos)));
                    pos++;
                }
            }
            for(int i = 0; i < message.length(); i++){
                if(message.charAt(i) == ' '){
                    s.append(" ");
                }else{
                    s.append(dict.get("" + message.charAt(i)));
                }
            }
            return s.toString();
        }
    }
}
