class Solution {
    public int repeatedStringMatch(String a, String b) {
        int i=1;
         String s=a;
        while(s.length() < b.length()){
             
             
            
              s=s+a;
              i++;
            
            
          
        }
        if (s.contains(b)) {
            return i;
        }
        s = s + a;
        i++;
        if (s.contains(b)) {
            return i;
        }
        return -1;
        
    }
}