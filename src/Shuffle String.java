//Shuffle String
//399 / 399 test cases passed.
//Status: Accepted
//Runtime: 1 ms

class Solution {
    public String restoreString(String s, int[] indices) {
        
        char[] strArray = new char[indices.length];
        
        for(int i = 0; i < indices.length; i++){
            int index = indices[i];
            strArray[ index ] = s.charAt(i);
        }
        String str = new String(strArray);
        return str;
    }
}