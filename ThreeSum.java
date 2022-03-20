import java.util.List;
import java.util.ArrayList;

public class ThreeSum {
    
    public static void main(String[] args) {
        // Test the method
        int[] nums = {-1,0,1,0,0};
        List<List<Integer>> list = threeSum(nums);
        for(int i = 0; i < list.size(); i++){
            System.out.println("[" + list.get(i).get(0) + " " + list.get(i).get(1) + " " + list.get(i).get(2) + "]");
        }
    }

    /**
     * 
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        if(nums.length >= 3){
            int one = 0;
            int two;
            int three;

            while(one != nums.length - 2){
                for(two = one + 1; two < nums.length; two++){
                    for(three = two + 1; three < nums.length; three++){
                        int first = nums[one];
                        int second = nums[two];
                        int third = nums[three];
                        if(first + second + third == 0){
                            boolean contains = true;
                            if(first == 0 && second == 0 && third == 0){
                                for(int j = 0; j < list.size() && contains; j++){
                                    if(list.get(j).get(0) == 0 && list.get(j).get(1) == 0 && list.get(j).get(2) == 0){
                                        contains = false;
                                    }
                                }
                            }else{
                                for(int j = 0; j < list.size() && contains; j++){
                                    if(list.get(j).contains(first) && list.get(j).contains(second) && list.get(j).contains(third)){
                                        contains = false;
                                    }
                                }
                            }
                            if(contains){
                                List<Integer> temp = new ArrayList<Integer>();
                                temp.add(nums[one]);
                                temp.add(nums[two]);
                                temp.add(nums[three]);
                                list.add(temp);
                            }
                        }
                    }                       
                }
                one++;
            }
        }
        return list;
    }
}
