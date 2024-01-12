class Solution {
    public int solution(int a, int b) {
	        int answer = 0;
	        String aa = String.valueOf(a) + String.valueOf(b);
	        String bb = String.valueOf(b) + String.valueOf(a);
	        
	        if(Integer.parseInt(aa) > Integer.parseInt(bb)) {
	        	return Integer.parseInt(aa);
	        }else {
	        	return Integer.parseInt(bb);
	        }
	        

	    }
	}