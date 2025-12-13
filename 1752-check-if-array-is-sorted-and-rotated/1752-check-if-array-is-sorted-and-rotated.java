class Solution {
    public boolean check(int[] nums) {
        int c=0;
        int k= nums.length;
        for(int i=0;i<k;i++){
            if (nums[i]>nums[(i+1)%k]){
                c++;
            }

        }
        return c<=1;
    }
}