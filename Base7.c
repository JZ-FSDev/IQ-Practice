
int ind = 0;
char ptr[12];


void convert(int num){
    if(num != 0){
        convert(num / 7);
        ptr[ind++] = '0' + (num - (num / 7) * 7);
    }
}

char * convertToBase7(int num){
    ind = 0;
    for(int i = 0; i < 12; i++){
        ptr[i] = '\0';
    }
    if(num < 0){
        ptr[ind++] = '-';
        num *= -1;
    }
    if(num > 0){
        convert(num);
    }else{
        ptr[ind++] = '0';
    }
    ptr[ind] = '\0';
    return ptr;
}
