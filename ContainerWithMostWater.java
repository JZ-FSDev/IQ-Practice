public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        System.out.println(maxArea(arr));
    }

    /**
     * You are given an integer array height of length n. There are n vertical lines
     * drawn such that the two endpoints of the ith line are (i, 0) and (i,
     * height[i]). Find two lines that together with the x-axis form a container,
     * such that the container contains the most water.
     * Return the maximum amount of water a container can store. Notice that you may
     * not slant the container.
     * 
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                int currentArea = Math.min(height[i], height[j]) * (j - i);
                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }
            }
        }
        return maxArea;
    }
}
