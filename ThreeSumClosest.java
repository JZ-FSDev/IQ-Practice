public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] nums = { -3, -2, -5, 3, -4 };
        System.out.println(threeSumClosest(nums, -1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int closest = nums[0] + nums[1] + nums[2];
        int first = 0;
        int second;
        int third;
        int sum;
        int sumDiff = 0;
        int closestDiff = 0;
        boolean found = false;

        // If the two numbers are on the same side of 0 (e.g., −2 and −6), the
        // difference is the result when you subtract the smaller absolute value from
        // the larger absolute value (e.g., |−6|−|−2|=6−2=4);
        if ((closest < 0 && target < 0) || (closest > 0 && target > 0)) {
            if (Math.abs(closest) < Math.abs(target)) {
                closestDiff = Math.abs(target) - Math.abs(closest);
            } else {
                closestDiff = Math.abs(closest) - Math.abs(target);
            }
            // If the two numbers are on opposite sides of 0 (e.g., −5 and 2), then you add
            // the absolute values (e.g., |−5|+|2|=5+2=7), or alternatively subtract the
            // negative number from the positive one which effects a sign change (e.g.,
            // 2−(−5)=2+5=7).
        } else {
            closestDiff = Math.abs(target) + Math.abs(closest);
        }

        while (first != nums.length - 2 && !found) {
            for (second = first + 1; second < nums.length && !found; second++) {
                for (third = second + 1; third < nums.length && !found; third++) {
                    sum = nums[first] + nums[second] + nums[third];
                    if (sum == target) {
                        found = true;
                        closest = sum;
                        // If the two numbers are on the same side of 0 (e.g., −2 and −6), the
                        // difference is the result when you subtract the smaller absolute value from
                        // the larger absolute value (e.g., |−6|−|−2|=6−2=4);
                    } else if ((target < 0 && sum < 0) || (target > 0 && sum > 0)) {
                        if (Math.abs(target) < Math.abs(sum)) {
                            sumDiff = Math.abs(sum) - Math.abs(target);
                        } else {
                            sumDiff = Math.abs(target) - Math.abs(sum);
                        }
                        // If the two numbers are on opposite sides of 0 (e.g., −5 and 2), then you add
                        // the absolute values (e.g., |−5|+|2|=5+2=7), or alternatively subtract the
                        // negative number from the positive one which effects a sign change (e.g.,
                        // 2−(−5)=2+5=7).
                    } else {
                        sumDiff = Math.abs(sum) + Math.abs(target);
                    }

                    if (sumDiff < closestDiff) {
                        closest = sum;
                        closestDiff = sumDiff;
                    }
                }
            }
            first++;
        }
        return closest;
    }
}
