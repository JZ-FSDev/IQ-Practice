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
