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
