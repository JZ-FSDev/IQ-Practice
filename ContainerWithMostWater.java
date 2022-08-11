/**
 * Self-written solution of "Container With Most Water" from LeetCode.
 *
 * @author JZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        // Test the method
        int[] arr = { 1, 1 };
        System.out.println(maxArea(arr));
    }

    /**
     * You are given an integer array height of length n. There are n vertical lines
     * drawn such that the two endpoints of the ith line are (i, 0) and (i,
     * height[i]). Find two lines that together with the x-axis form a container,
     * such that the container contains the most water.
     * Return the maximum amount of water a container can store.
     * Notice that you may not slant the container.
     * 
     * @param height The array of different heights.
     * @return The max area of the array given the restrictions.
     */
    static public int maxArea(int[] height) {
        int area = Integer.MIN_VALUE;
        int i = 0, j = height.length - 1;
        while (i < j) {
            area = Math.max(area, (j - i) * Math.min(height[i], height[j]));
            if (height[j] > height[i]) {
                i++;
            } else if (height[j] < height[i]) {
                j--;
            } else {
                j--;
                i++;
            }
        }
        return area;
    }
}
