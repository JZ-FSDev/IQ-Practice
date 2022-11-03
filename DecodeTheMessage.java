// @author JZ-FSDev
// Runtime: 12 ms, faster than 71.97% of Java online submissions for Decode the Message.

// You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

// Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
// Align the substitution table with the regular English alphabet.
// Each letter in message is then substituted using the table.
// Spaces ' ' are transformed to themselves.
// For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
// Return the decoded message.

public class DecodeTheMessage {
    class Solution {
        public String decodeMessage(String key, String message) {
            StringBuilder s = new StringBuilder();
            HashMap<Character, Character> dict = new HashMap<Character, Character>();
            int pos = 0;
            for(int i = 0; i < key.length() && dict.size() < 26; i++){
                if(key.charAt(i) != ' ' && dict.get(key.charAt(i)) == null){
                    dict.put(key.charAt(i), ((char)('a' + pos)));
                    pos++;
                }
            }
            for(int i = 0; i < message.length(); i++){
                if(message.charAt(i) == ' '){
                    s.append(" ");
                }else{
                    s.append("" + dict.get(message.charAt(i)));
                }
            }
            return s.toString();
        }
    }
}
