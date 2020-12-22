// Running Sum of 1d Array
// 53 / 53 test cases passed.
// Status: Accepted
// Runtime: 0 ms
// Memory Usage: 39 MB

class Solution {
    public int[] runningSum(int[] nums) {
        int sumSoFar = 0;
        int[] arrayToReturn = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            sumSoFar = sumSoFar + nums[i];
            arrayToReturn[i] = sumSoFar;
        }
        
        return arrayToReturn;
    }
}