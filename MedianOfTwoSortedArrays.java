public class MedianOfTwoSortedArrays {
    
    public static void main(String[] args) {
        // Test the method
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};
        double d = findMedianSortedArrays(arr1, arr2);
        System.out.println(d);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mid = (nums1.length + nums2.length) / 2;
        boolean odd = (nums1.length + nums2.length) % 2 == 1;
        double ans;

        int curr1 = 0;
        int curr2 = 0;
        int index = 0;
        int[] temp = new int[mid + 1];
        for(int i = 0; i <= mid; i++){ // merge both arrays up until the mid point (elements past the mid is irrelvant)
            if (curr1 < nums1.length && (curr2 >= nums2.length || nums1[curr1] < nums2[curr2])) {
                temp[index++] = nums1[curr1++];
            } else {
                temp[index++] = nums2[curr2++];
            }
        }

        if(odd){  // check if odd
            ans = temp[mid];
        }else{
            ans = (temp[mid - 1] + temp[mid]) / 2.0;
        }

        return ans;
    }
}
