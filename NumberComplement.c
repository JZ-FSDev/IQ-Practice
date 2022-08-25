// @author JZ-FSDev
// Runtime: 0 ms, faster than 100.00% of C online submissions for Number Complement.

// The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
// For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
// Given an integer num, return its complement.

int ret = 0;

void solve(int num){
    if(num > 0){
        solve(num / 2);
        ret <<= 1;  
        if(num % 2 == 0){
            ret += 1;
        }
    }
}

int findComplement(int num){
    ret = 0;
    solve(num);
    return ret;
}
