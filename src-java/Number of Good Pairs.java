//Number of Good Pairs
//48 / 48 test cases passed.
//Status: Accepted
//Runtime: 1 ms

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if( nums[i] == nums[j] && i < j ) {
                    count = count + 1;
                }
            }
        }
        
        return count;
    }
}