//Goal Parser Interpretation
//105 / 105 test cases passed.
//Status: Accepted
//Runtime: 1 ms

class Solution {
    public String interpret(String command) {
        
        String output = "";
        
        for(int i = 0; i < command.length(); i++){
            
            if( command.charAt(i) == 'G' ){
                output = output + "G";
            }
            if( command.charAt(i) == '(' ){
                if( command.charAt(i + 1) == ')' ){
                    output = output + "o";
                }
                else{
                    output = output + "al";
                }
            }
        }
        return output;
    }
}