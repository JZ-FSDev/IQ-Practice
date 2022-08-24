// @author JZ-FSDev
// Runtime: 0 ms, faster than 100.00% of C online submissions for Binary Number with Alternating Bits.

// Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

bool hasAlternatingBits(int n){
    int curr = n % 2;
    n /= 2; // shift bits to right
    while(n > 0){
        if(curr == n % 2){
            return false;
        }
        curr = n % 2;
        n /= 2;
    }
    return true;
}
