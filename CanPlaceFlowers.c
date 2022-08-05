

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
