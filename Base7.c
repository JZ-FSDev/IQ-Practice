

char * convertToBase7(int num){
    int result = 0;
    int resultTemp = 0;
    int digits = 1;
    char *ptr;
    if(num > 0){
        while(num > 0){
            if(num >= 7){
                num -= 7;
                result += 10;
            }else{
                result += num;
                num = 0;
            }
        }
    }else{
        while(num < 0){
            if(num <= -7){
                num += 7;
                result -= 10;
            }else{
                result -= num;
                num = 0;
            }
        }
    }
    resultTemp = result;
    while(result > 0){
        digits++;
        result /= 10;
    }
    ptr = malloc(digits + 3);
    if(ptr){
        int index = 0;
        if(resultTemp != 0){
            if(resultTemp < 0){
                ptr[index++] = '-';
            }
            while(resultTemp != 0){
                if(resultTemp == 10){
                    ptr[index++] = '1';
                    ptr[index++] = '0';
                }else{
                    ptr[index++] = '0' + (resultTemp % 10);
                }
                resultTemp /= 10;
            }
        }else{
            ptr[index++] = '0';
        }
        ptr[index] = '\0';
    }
    return ptr;
}
