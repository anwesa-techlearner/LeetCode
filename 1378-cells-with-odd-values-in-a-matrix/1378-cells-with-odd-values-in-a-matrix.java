class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] d = new int[m][n];
        int c = 0;
        for(int i=0;i<indices.length;i++){
            int x = indices[i][0];
            int y = indices[i][1];
            for(int j=0;j<n;j++){d[x][j]+=1;}
            for(int j=0;j<m;j++){d[j][y]+=1;}
        }
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(d[i][j]%2!=0) c=c+1;
    }
}
return c;

        
    }
}