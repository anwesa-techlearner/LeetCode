class Solution {
    public int numIdenticalPairs(int[] nums) {
        int l = nums.length;
        int k = 0;
        for (int i=0;i<l;i++){
            for(int j = 1 ; j <l; j ++){
                if(nums[i]==nums[j]&& i<j){
                    k = k+1;
                }
            }
        
        }
        return k;
    }
}