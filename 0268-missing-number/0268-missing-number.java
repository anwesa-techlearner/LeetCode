class Solution {
    public int missingNumber(int[] arr) {
        int len=arr.length;
        int sum=0;
        for(int i=0;i<len;i++){
            sum=sum+arr[i];

        }
       int  total=(len*(len+1))/2;
        return total-sum;
    }
}