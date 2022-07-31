int min(int a, int b){
    return a <= b ? a : b;
}

void sort(int nums[], int output[], int numLength){
    int min = INT_MAX;
    int temp = -1;
    int temptemp;
    for(int i = 0; i < numLength; i++){
        min = INT_MAX;
        temp = -1;
        for(int k = i; k < numLength; k++){
            if(nums[k] < min){
                min = nums[k];
                temp = k;
            }
        }
        temptemp = nums[i];
        nums[i] = nums[temp];
        nums[temp] = temptemp;
    }
}

int arrayPairSum(int* nums, int numsSize){
    int temp[numsSize];
    int sum = 0;
    sort(nums, temp, numsSize);
    for(int i = 0; i < numsSize; i+=2){
        sum += min(nums[i], nums[i+1]);
    }
    return sum;
}
