// @author JZ-FSDev
// Runtime: 0 ms, faster than 100.00% of C online submissions for Detect Capital.

// We define the usage of capitals in a word to be right when one of the following cases holds:

// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

bool detectCapitalUse(char * word){
    bool proper = true;
    for(int i = 0; i < strlen(word) && proper; i++){
        if(isupper(word[i])){
            if(i >= 1){
                int j;
                for(j = 0; j <= i && proper; j++){
                    if(!isupper(word[j])){
                        proper = false;
                    }
                }
                // case when next some char is capital and first char is not
                if(j < strlen(word) && isupper(word[j - 1]) && !isupper(word[j])){
                    proper = false;
                }
            }
        }
    }
    return proper;
}
