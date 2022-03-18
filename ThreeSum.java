import java.util.List;
import java.util.ArrayList;

public class ThreeSum {
    
    public static void main(String[] args) {
        
    }

    /**
     * 
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        if(nums.length > 3){
            int one = 0;
            int two = 1;
            int three = 2;

            while(one != nums.length - 3 && two != nums.length - 2){
                if(nums[one] + nums[two] + nums[three] == 0){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[one]);
                    temp.add(nums[two]);
                    temp.add(nums[three]);
                }
            }
        }
    
        return list;
    }
}
