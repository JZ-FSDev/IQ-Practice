// Fix solution when bitshifting is covered

int findComplement(int num){
    int newNum = 0;
    int digit = (int)log10(num) + 1;
    for(int i = 0; i < digit; i++){
        if(num % 10 == 0){
            newNum += 1 * (int)pow(10, i); 
        }
        num /= 10;
    }
    return binaryTodecimal(newNum);
}
