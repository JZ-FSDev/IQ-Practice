// @author JZ-FSDev
// Runtime: 4 ms, faster than 15.76% of Java online submissions for Find the K-Beauty of a Number.

// The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:

// It has a length of k.
// It is a divisor of num.
// Given integers num and k, return the k-beauty of num.

// Note:

// Leading zeros are allowed.
// 0 is not a divisor of any value.
// A substring is a contiguous sequence of characters in a string.

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
