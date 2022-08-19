
// @author JZ-FSDev
// Runtime: 14 ms, faster than 97.56% of C online submissions for Valid Palindrome II.

// Given a string s, return true if the s can be palindrome after deleting at most one character from it.

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

