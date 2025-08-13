class Solution {
    public int largestAltitude(int[] gain) {
        int l = gain.length;
        int[] p = new int[l+1];
        p[0]=0;
        int max=0;
        for(int i=0;i<l;i++){
            p[i+1]=p[i]+gain[i];
            if (p[i+1]>max) max=p[i+1];
        } 
        return max;
    }
}