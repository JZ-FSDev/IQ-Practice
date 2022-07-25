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
                if(j < strlen(word) && isupper(word[j - 1]) && !isupper(word[j])){
                    proper = false;
                }
            }
        }
    }
    return proper;
}
