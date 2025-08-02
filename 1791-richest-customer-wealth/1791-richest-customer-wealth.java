class Solution {
    public int maximumWealth(int[][] accounts) {
       int maxWealth=0;          //contains the wealth of richest customer

       for(int i=0; i< accounts.length; i++){    // Outer loop: Iterate through each customer (row in 2D array)
        int currWealth=0;     // Wealth of the current customer
        for(int j=0; j<accounts[i].length; j++){     // Inner loop: Sum all accounts of the current customer
            currWealth+= accounts[i][j];
        }
        if(currWealth > maxWealth){
            maxWealth= currWealth;// Update max wealth if current customer is richer
        }
       } 
       return maxWealth;    //return the wealth of richest customer
    }
}