
bool solve(int i, int j, char *s){
    while(j > i){
        if(s[i] != s[j]){
            return false;
        }
        j--;
        i++;
    }
    return true;
}

bool validPalindrome(char * s){
    int count = 0;
    int j = strlen(s) - 1;
    int i = 0;
    while(j > i){
        if(s[i] != s[j]){
            count++;
            return solve(i+1, j, s) || solve(i, j-1, s);
        }
        j--;
        i++;
    }
    return true;
}

