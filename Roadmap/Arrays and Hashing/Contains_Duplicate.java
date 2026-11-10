class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            for(int k = 0; k < i; k++){
                if(nums[k]==nums[i]){
                    return true;
                }
            }
        }
        return false;
    }
}