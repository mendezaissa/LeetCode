//Determine if String Halves Are Alike
//113 / 113 test cases passed.
//Status: Accepted
//Runtime: 2 ms

class Solution {
    public boolean halvesAreAlike(String s) {
        int halfOne = 0;
        int halfTwo = 0;
        String half_one = s.substring(0, (s.length() / 2));
        String half_two = s.substring((s.length() / 2), s.length());
        
        for(int j=0; j<half_one.length(); j++)
	    {
	        char ch = half_one.charAt(j);
	        switch(ch)
	        {
	            case 'a' : halfOne++;
                    break;
	            case 'e'  : halfOne++;
                    break;
	            case 'i'  : halfOne++;
                    break;
	            case 'o'  : halfOne++;
                    break;
	            case 'u'  : halfOne++;
                    break;
	            case 'A' : halfOne++;
                    break;
	            case 'E'  : halfOne++;
                    break;
	            case 'I'  : halfOne++;
                    break;
	            case 'O'  :	halfOne++;
                    break;
	            case 'U'  : halfOne++;
                    break;
	        }
        }
            
        for(int j=0; j<half_two.length(); j++)
	    {
	        char ch = half_two.charAt(j);
	        switch(ch)
	        {
	            case  'a' : halfTwo++;
                    break;
	            case 'e'  : halfTwo++;
                    break;
	            case 'i'   : halfTwo++;
                    break;
	            case 'o'  : halfTwo++;
                    break;
	            case 'u'  : halfTwo++;
                    break;
	            case  'A' : halfTwo++;
                    break;
	            case 'E'  : halfTwo++;
                    break;
	            case 'I'   :halfTwo++;
                    break;
	            case 'O'  :	halfTwo++;
                    break;
	            case 'U'  : halfTwo++;
                    break;
	        }
        }
            
        if(halfOne == halfTwo){
            return true;
        }
        return false;
    }
}