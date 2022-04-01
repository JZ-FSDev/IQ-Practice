public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][matrix[i].length - 1] >= target){
                if(i != -1 && binarySearch(matrix[i], target) != -1){
                    return true;
                }
                break;
            }
        }
        return false;
    }

    public static int binarySearch(int[] array, int key){
        return binarySearch(0, array.length - 1, array, key);
    }

    private static int binarySearch(int low, int high, int[] array, int key){
        int mid = (high + low) / 2;
        while(low <= high){
            mid = (low + high) / 2;
            if(array[mid] == key){
                return mid;
            }else if(array[mid] < key){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            mid = (high + low) / 2;
        }
        return -1;
    }
}
