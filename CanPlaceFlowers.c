
// @author JZ-FSDev
// Runtime: 17 ms, faster than 96.24% of C online submissions for Can Place Flowers.

// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.

bool canPlaceFlowers(int* flowerbed, int flowerbedSize, int n){
    int count = 0;
    if(flowerbedSize == 1 && flowerbed[0] == 0){
        count++;
    }else{
        for(int i = 0; i < flowerbedSize; i++){
            if(flowerbed[i] == 0){
                if(i == 0 && flowerbed[i + 1] == 0){
                    count++;
                    flowerbed[i] = 1;
                }else 
                if(i == flowerbedSize - 1 && flowerbed[i - 1] == 0){
                    count++;
                    flowerbed[i] = 1;
                }else 
                if(i > 0 && i < flowerbedSize - 1 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0){
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
    }
    return count >= n;
}
