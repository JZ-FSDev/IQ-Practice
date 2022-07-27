class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int len = 0;
        int temp;
        int count;
        for(int i = 0; i < nums.length; i++){
            temp = 2;
            count = 0;
            for(int j = i + 1; j < nums.length; j++){
                if(count >= 2 && nums[i] == nums[j]){
                    count++;
                }else if(nums[i] == nums[j]){
                    count = 2;
                    temp--;
                }
                if(Math.abs(nums[j] - nums[i]) == 1){
                    for(int k = j + 1; k < nums.length; k++){
                        if(nums[k] == nums[j]){
                            temp++;
                        }
                    }
                    if(temp + count > len){
                        len = temp + count;
                    }
                    break;
                }    
            }

        }
        return len;
    }
}
