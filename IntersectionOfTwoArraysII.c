

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* intersect(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize){
    
    if(nums1Size > nums2Size){ // make nums1 always smaller or equal
        int *temp = nums2;
        int tempNum = nums2Size;
        nums2 = nums1;
        nums1 = temp;
        nums2Size = nums1Size;
        nums1Size = tempNum;
    }
    
    int *tempIntersect = malloc(sizeof(int) * nums1Size);
    int tempIndex = 0;
    
    int *intersect = malloc(sizeof(int) * nums1Size);
    int index = 0;
    
    
    for(int i = 0; i < nums2Size; i++){ // iterate on the larger of the two
        if(nums2[i] == nums1[0]){
            
            tempIndex++;
            
            for(int j = 1; j < nums1Size && i + j < nums2Size; j++){ // iterate on the smaller of the two
                if(nums2[i + j] == nums1[j]){
                    tempIndex++;
                }
            }
            
            memcpy(tempIntersect, nums2 + i, tempIndex * sizeof(int));
            
            if(tempIndex > index){
                memcpy(intersect, tempIntersect, tempIndex * sizeof(int));
                index = tempIndex;
                tempIndex = 0;
            }
        }
    }
    
    return intersect;
}
