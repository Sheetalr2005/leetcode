class Solution {
    public String longestCommonPrefix(String[] words) {
       int minlength=words[0].length();
	    
	    for(int i=1;i<words.length;i++){
	        minlength=Math.min(minlength,words[i].length());
	    }
	    
	    String prefix="";
	    
	    for(int i=0;i<minlength;i++){
	        for(int j=1;j<words.length;j++){
	            if(words[j].charAt(i)!=words[0].charAt(i)){
	                return prefix;
	            }
	        }
	        prefix=prefix+words[0].charAt(i);
	    }
	    
	    return prefix;
	}
        
 }
