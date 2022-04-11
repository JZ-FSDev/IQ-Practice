 /**
 * Self-written solution for "Search a 2D Matrix" from LeetCode.
 * (Faster than 100% of Java submissions).
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class Search2DMatrix {

    /**
     * Write an efficient algorithm that searches for a value target in 
     * an m x n integer matrix matrix. This matrix has the following properties:
     * Integers in each row are sorted from left to right.
     * The first integer of each row is greater than the last integer of the previous row.
     * 
     * @param matrix The 2D int array to be searched.
     * @param target The int target to be searched for.
     * @return The index of the int target and -1 if not found.
     */
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

    /**
     * Performs a binary search on a sorted int array with the given key.
     * 
     * @param array The int array to be seached.
     * @param key The int to be searched for.
     * @return The index of the int target and -1 if not found.
     */
    public static int binarySearch(int[] array, int key){
        return binarySearch(0, array.length - 1, array, key);
    }

    /**
     * Binary search helper method.  Returns the index of the specified key
     * if it exists and -1 if it is not found.
     * 
     * @param low The starting index of the region to be searched.
     * @param high The ending index of the region to be searched.
     * @param array The int array to be searched.
     * @param key The int key to be searched for.
     * @return Index of the specified key if it exists and -1 if it is not found.
     */
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
