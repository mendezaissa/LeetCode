//Richest Customer Wealth
//34 / 34 test cases passed.
//Status: Accepted
//Runtime: 0 ms
//Memory Usage: 38.8 MB

class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int sum = 0;
        int highestWealth = 0;
        
        for (int i = 0; i < accounts.length; i++) {
            
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            
            if(sum > highestWealth){
                highestWealth = sum;
                sum = 0;
            }
            else{
                sum = 0;
            }
            
        }
        
        return highestWealth;
    }
}