//Defanging an IP Address
//62 / 62 test cases passed.
//Status: Accepted
//Runtime: 5 ms

class Solution {
    public String defangIPaddr(String address) {
        
        String copy = "";
        
        for (int i = 0; i < address.length(); i++){
            char c = address.charAt(i);
            
            if (c == '.'){
                copy = copy + "[.]";
            }
            else{
                copy = copy + c;
            }
        }
        return copy;
    }
}