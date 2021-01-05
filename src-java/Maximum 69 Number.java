//Maximum 69 Number
//153 / 153 test cases passed.
//Status: Accepted
//Runtime: 1 ms

class Solution {
    public int maximum69Number (int num) {
        int max = 0;
        int number = 0;
        String numbr = "";
        String string = Integer.toString(num);
        
        for(int i = 0; i < string.length(); i++){
            
            if(string.charAt(i) == '9'){
                StringBuilder string2 = new StringBuilder(string);
                string2.setCharAt(i, '6');
                numbr = string2.toString();
                number = Integer.parseInt(numbr);
                
                if(number > max){
                    max = number;
                }
            }
            if(string.charAt(i) == '6'){
                StringBuilder string2 = new StringBuilder(string);
                string2.setCharAt(i, '9');
                numbr = string2.toString();
                number = Integer.parseInt(numbr);
                
                if(number > max){
                    max = number;
                }
            }
            
            if(max < num){
                max = num;
            }
        }
        return max;
    }
}