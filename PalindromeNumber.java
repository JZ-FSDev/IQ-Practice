public class PalindromeNumber {
    
    public static void main(String[] args) {
        System.out.println(isPalindrome(010));
    }

    
    public static boolean isPalindrome(int x) {
        boolean result = true;
        if(x < 0){
            result = false;
        }else{
            int start = 0, end = (int) Math.log10(x);
            while(result && start <= end){
                if((int)(x / Math.pow(10, start++) % 10) != (int)(x / Math.pow(10, end--) % 10)){
                    result = false;
                }
            }
        }
        return result;
    }
}
