//Count of Matches in Tournament
//200 / 200 test cases passed.
//Status: Accepted
//Runtime: 0 ms

class Solution {
    public int numberOfMatches(int n) {
        boolean winner = false;
        int matches = 0;
        int teamsAdvance = n;
        int count = 0;
        
        if(n == 1){
            return 0;
        }
        
        while(winner != true){
            
            if(teamsAdvance == 2){
                matches = teamsAdvance / 2;
                count = count + 1;
                winner = true;
                break;
            }
            
            if(teamsAdvance % 2 == 0){
                matches = teamsAdvance / 2;
                count = count + matches;
                teamsAdvance = teamsAdvance / 2;
            }
        
            if(teamsAdvance % 2 != 0){
                matches = (teamsAdvance - 1) / 2;
                count = count + matches;
                teamsAdvance = (teamsAdvance - 1) / 2 + 1;
            }
        }
        
        return count;
    }
}