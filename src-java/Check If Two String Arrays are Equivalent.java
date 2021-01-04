//Check If Two String Arrays are Equivalent
//107 / 107 test cases passed.
//Status: Accepted
//Runtime: 7 ms

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        boolean ans = false;
        
        String string1 = Arrays.toString(word1);
        String string2 = Arrays.toString(word2);
        
        string1 = string1.replaceAll("\\s", ""); 
        string2 = string2.replaceAll("\\s", "");
        
        string1 = string1.replaceAll(",", "");
        string2 = string2.replaceAll(",", "");
        
        if(string1.equals(string2)){
            return true;
        }
        
        return ans;
    }
}