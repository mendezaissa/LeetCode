//Decompress Run-Length Encoded List
//53 / 53 test cases passed.
//Status: Accepted
//Runtime: 3 ms

class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i = i + 2){
            int freq = nums[i];
            int val = nums[i + 1];
            
            for(int j = 0; j < freq; j++){
                list.add(val);
            }
        }
        
        int[] output = new int[list.size()];
        
        for(int z = 0; z < list.size(); z++){
            output[z] = list.get(z);
        }
        
        return output;
    }
}