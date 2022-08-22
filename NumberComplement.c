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
