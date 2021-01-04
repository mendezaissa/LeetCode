//XOR Operation in an Array
//54 / 54 test cases passed.
//Status: Accepted
//Runtime: 0 ms

class Solution {
    public int xorOperation(int n, int start) {
        
        int bitwise = 0;
        
        int[] nums = new int[n];
        
        //creating array nums
        for(int i = 0; i < nums.length; i++){
            nums[i] = start + 2 * i;
        }
        
        //finding xor of all elements of nums
        for(int j = 0; j < nums.length; j++){
            
            bitwise = bitwise ^ nums[j];
        }
        
        return bitwise;
    }
}