class Solution {
    public int solution(int a, int b) {
	        
	        String aa = String.valueOf(a) + String.valueOf(b);
	        int bb = a * b *2;

	        
	        if(Integer.parseInt(aa) >= bb ) {
	        return Integer.parseInt(aa);
	        }else {
	        	return bb;
	        }
	        
	  }	
}
