//Count the Number of Consistent Strings
//74 / 74 test cases passed.
//Status: Accepted
//Runtime: 21 ms

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i = 0; i < words.length; i++){
            
            for(int j = 0; j < words[i].length(); j++){
                String w = words[i];
                char c = w.charAt(j);
                String s = String.valueOf(c);
                
                if( !allowed.contains(s) ){
                    break;
                }
                if( j == words[i].length() - 1){
                    count++;
                }
            }
        }
        return count;
    }
}