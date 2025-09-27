class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==1){
            return 0;
        }

       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        int j=0;
        for( j=0;j<s.length();j++){
            if(c==s.charAt(j) && j!=i){
                break;
            }
            
        }
        if(j==s.length()) return i;
        
       }
       return -1; 
    }
}