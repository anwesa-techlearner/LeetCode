class Solution {
    public int maxSum(int[][] grid) {
        int m = grid.length , n = grid[0].length;
        int ans = 0;
        for(int i = 1 ; i < m-1 ; i++){
            int sum = 0;
            for(int j = 1 ; j < n-1 ; j++){
                sum = grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1] + grid[i][j] + grid[i+1][j-1] + grid[i+1][j] + grid[i+1][j+1];
                ans = Math.max(sum , ans);
            }
        }
        return ans;
    }
}