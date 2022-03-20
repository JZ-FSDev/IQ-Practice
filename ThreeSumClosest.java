public class ThreeSumClosest {

    public static void main(String[] args) {
        
    }

    public static int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        int first = 0;
        int second;
        int third;
        int sum;

        while(first != nums.length - 2){
            for(second = first + 1; second < nums.length; second++){
                for(third = second + 1; third < nums.length; third++){
                    sum = nums[first] + nums[second] + nums[third];
                    if(Math.abs(Math.abs(target) - Math.abs(sum)) < Math.abs(Math.abs(closest) - Math.abs(sum))){
                        closest = sum;
                    }
                }
            }
            first++;
        }
        return closest;
    }
}
