// Runtime: 15 ms, faster than 96.80% of C online submissions for Power of Three.

// Given an integer n, return true if it is a power of three. Otherwise, return false.
// An integer n is a power of three, if there exists an integer x such that n == 3x.
bool isPowerOfThree(int n){
    bool isPower = false;
    if(n == 1){
        isPower = true;
    }
    while(n >= 3 && !isPower && n % 3 == 0){
        if((n / 3) == 1){
            isPower = true;
        }else{
            n /= 3;
        }
    }
    return isPower;
}
