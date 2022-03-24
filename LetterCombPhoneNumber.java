import java.util.ArrayList;
import java.util.List;

public class LetterCombPhoneNumber {
    
    public static void main(String[] args) {
       List<String> result = letterCombinations("5678");
       for(String s : result){
           System.out.print(s + " ");
       }
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
