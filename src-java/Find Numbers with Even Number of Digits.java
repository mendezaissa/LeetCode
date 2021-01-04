//Find Numbers with Even Number of Digits
//104 / 104 test cases passed.
//Status: Accepted
//Runtime: 1 ms

class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int digit = nums[i];
            int size = Integer.toString(digit).length();
            if(size % 2 == 0){
                count++;
            }
        }
        return count;
    }
}