
//Kids With the Greatest Number of Candies
//103 / 103 test cases passed.
//Status: Accepted
//Runtime: 4 ms

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> list = new ArrayList<Boolean>(); 
        List<Integer> listCandies = new ArrayList<Integer>();
        
        for(int j = 0; j < candies.length; j++){
            listCandies.add(candies[j]);
        }
        
        for(int i = 0; i < candies.length; i++){
            int newCandie = candies[i] + extraCandies;
            
            if(newCandie >= Collections.max(listCandies)){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        
        return list;
    }
}