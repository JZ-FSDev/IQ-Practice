class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int len = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            temp = 0;
            for(int j = i + 1; j < nums.length; j++){
                if(Math.abs(nums[j] - nums[i]) == 1){
                    temp++;
                }else{
                    break;
                }    
            }
            if(temp > len){
                len = temp;
            }
        }
        return len;
    }
}
