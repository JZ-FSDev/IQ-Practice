public class FindTheKBeautyOfANumber {
    class Solution {
        public int divisorSubstrings(int num, int k) {
            int count = 0;
            int numTemp = num;
            int[] arr = new int[(int)(Math.log10(num) + 1)];
            for(int i = arr.length - 1; i >= 0; i--){
                System.out.print(num % 10);
                arr[i] = num % 10;
                num /= 10;
            }
            int digit = k - 1;
            int sub = 0;
            for(int i = 0; i < arr.length - k + 1; i++){
                for(int j = i; j < i + k; j++){
                    sub += (arr[j] * Math.pow(10, digit));
                    digit--;
                }
                if(sub > 0 && numTemp % sub == 0){
                    count++;
                }
                digit = k - 1;
                sub = 0;
            }
            return count;
        }
    }
}
