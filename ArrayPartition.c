// @author JZ-FSDev
// Runtime: 66 ms, faster than 83.22% of C online submissions for Array Partition.

// Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., 
// (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

int min(int a, int b){
    return a <= b ? a : b;
}

// function to swap elements
void swap(int *a, int *b) {
  int t = *a;
  *a = *b;
  *b = t;
}

// function to find the partition position
int partition(int array[], int low, int high) {
  
  // select the rightmost element as pivot
  int pivot = array[high];
  
  // pointer for greater element
  int i = (low - 1);

  // traverse each element of the array
  // compare them with the pivot
  for (int j = low; j < high; j++) {
    if (array[j] <= pivot) {
        
      // if element smaller than pivot is found
      // swap it with the greater element pointed by i
      i++;
      
      // swap element at i with element at j
      swap(&array[i], &array[j]);
    }
  }

  // swap the pivot element with the greater element at i
  swap(&array[i + 1], &array[high]);
  
  // return the partition point
  return (i + 1);
}

void quickSort(int array[], int low, int high) {
  if (low < high) {
    
    // find the pivot element such that
    // elements smaller than pivot are on left of pivot
    // elements greater than pivot are on right of pivot
    int pi = partition(array, low, high);
    
    // recursive call on the left of pivot
    quickSort(array, low, pi - 1);
    
    // recursive call on the right of pivot
    quickSort(array, pi + 1, high);
  }
}

int arrayPairSum(int* nums, int numsSize){
    int temp[numsSize];
    int sum = 0;
    quickSort(nums, 0, numsSize - 1);
    for(int i = 0; i < numsSize; i+=2){
        sum += min(nums[i], nums[i+1]);
    }
    return sum;
}
