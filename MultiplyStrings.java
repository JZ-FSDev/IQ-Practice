public class MultiplyStrings {
    
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }

    public static String multiply(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] temp = new int[num1.length() + num2.length()];
        int product = 0;
        int index = 0;
        int place = 0;

        if(!num1.equals("0") && !num2.equals("0")){
            for(int i = num2.length() - 1; i >= 0; i--){
                index = place;
                place++;
                for(int j = num1.length() - 1; j >= 0; j--){
                    product = (num1.charAt(j) - 48) * (num2.charAt(i) - 48);
                    if(product >= 10){
                        temp[index + 1] += product / 10;
                        temp[index] += product % 10;
                    }else{
                        temp[index] += product;
                    }
                    index++;
                }
            }
            for(int i = 0; i < temp.length; i++){
                if(temp[i] >= 10){
                    temp[i + 1] += temp[i] / 10;
                    temp[i] %= 10;
                }
            }
            for(int i = temp.length - 1; i >= 0; i--){
                stringBuilder.append(temp[i]);
            }
            if(stringBuilder.charAt(0) == '0'){
                stringBuilder.delete(0, 1);
            }
        }else{
            return "0";
        }
        return stringBuilder.toString();
    }
}
