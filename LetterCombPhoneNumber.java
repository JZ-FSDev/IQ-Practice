import java.util.ArrayList;
import java.util.List;

public class LetterCombPhoneNumber {
    
    public static void main(String[] args) {
       List<String> result = letterCombinations("5678");
       for(String s : result){
           System.out.print(s + " ");
       }
    }
    
        public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        char[] group1, group2, group3, group4;
        if(digits.length() == 1){
            group1 = convert(Integer.parseInt(digits));
            for(int i = 0; i < group1.length; i++){
                result.add("" + group1[i]);
            }
        }else if(digits.length() == 2){
            group1 = convert(Integer.parseInt(digits.substring(0, 1)));
            group2 = convert(Integer.parseInt(digits.substring(1, 2)));
            for(int i = 0; i < group1.length; i++){
                for(int j = 0; j < group2.length; j++){
                    result.add("" + group1[i]);
                }
            }
            for(int i = 0; i < group1.length * group2.length; i++){
                result.set(i, result.get(i) + group2[i % group2.length]);
            }
        }else if(digits.length() == 3){
            group1 = convert(Integer.parseInt(digits.substring(0, 1)));
            group2 = convert(Integer.parseInt(digits.substring(1, 2)));
            group3 = convert(Integer.parseInt(digits.substring(2, 3)));
            for(int i = 0; i < group1.length; i++){
                for(int j = 0; j < group2.length * group3.length; j++){
                    result.add("" + group1[i]);
                }
            }
            int count = 0;
            int index = 0;
            for(int j = 0; j < group1.length * group2.length; j++){
                for(int i = 0; i < group3.length; i++){
                    result.set(index, result.get(index) + group2[count % group2.length]);
                    index++;
                }
                count++;
            }
            for(int i = 0; i < group1.length * group2.length * group3.length; i++){
                result.set(i, result.get(i) + group3[i % group3.length]);
            }
        }
        return result;
    }

    private static char[] convert(int i){
        if(i == 2){
            char[] group = {'a', 'b', 'c'};
            return group;
        }else if(i == 3){
            char[] group = {'d', 'e', 'f'};
            return group;
        }else if(i == 4){
            char[] group = {'g', 'h', 'i'};
            return group;
        }else if(i == 5){
            char[] group = {'j', 'k', 'l'};
            return group;
        }else if(i == 6){
            char[] group = {'m', 'n', 'o'};
            return group;
        }else if(i == 7){
            char[] group = {'p', 'q', 'r', 's'};
            return group;
        }else if(i == 8){
            char[] group = {'t', 'u', 'v'};
            return group;
        }else{
            char[] group = {'w', 'x', 'y', 'z'};
            return group;
        }
    }
}
