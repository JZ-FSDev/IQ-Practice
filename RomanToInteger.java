public class RomanToInteger {
    
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        boolean iFound = false;
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            if(iFound){
                if(s.charAt(i) == 'I'){
                    num += 1;
                }else if(s.charAt(i) == 'V'){
                    num += 4;
                }else if(s.charAt(i) == 'X'){
                    num += 9;
                }else if(s.charAt(i) == 'L'){
                    num += 40;
                }else if(s.charAt(i) == 'C'){
                    num += 90;
                }else if(s.charAt(i) == 'D'){
                    num += 400;
                }else if(s.charAt(i) == 'M'){
                    num += 900;
                }
                iFound = false;
            }else{
                if(s.charAt(i) == 'I'){
                    num += 1;
                }else if(s.charAt(i) == 'V'){
                    num += 5;
                }else if(s.charAt(i) == 'X'){
                    num += 10;
                }else if(s.charAt(i) == 'L'){
                    num += 50;
                }else if(s.charAt(i) == 'C'){
                    num += 100;
                }else if(s.charAt(i) == 'D'){
                    num += 500;
                }else if(s.charAt(i) == 'M'){
                    num += 1000;
                }
            }
            if(s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C'){
                iFound = true;
            }
        }
        return num;
    }
}
