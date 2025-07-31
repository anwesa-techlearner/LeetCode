class Solution {
    public int[] buildArray(int[] nums) {
       int []ans= new int[nums.length];
      for(int i=0;i<nums.length;i++){
        
         ans[i]=nums[nums[i]];
      }
      return ans;
    }
      public static void main(String[] args){
        Solution a=new Solution();
        int []nums={3,2,1,4,5,6};
        int[] result= a.buildArray(nums);

        for (int num : result) {
            System.out.print(num + " ");
      }
    }
}