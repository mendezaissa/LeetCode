//Number of Steps to Reduce a Number to Zero
//204 / 204 test cases passed.
//Status: Accepted
//Runtime: 0 ms

class Solution {
    public int numberOfSteps (int num) {
        
        int i = num;
        int count = 0;
  
        while (i != 0) { 
            
            if(i % 2 == 0){
                i = i / 2;
                count++;
            }
            else{
                i = i - 1;
                count++;
            }
        } 
        return count;
    }
}