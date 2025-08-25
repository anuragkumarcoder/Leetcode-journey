class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans=garbage[0].length();
        int gl=0;
        int ml=0;
        int pl=0;
      for(int i=1;i<garbage.length;i++){
        for(int j=0;j<garbage[i].length();j++){
            char c=garbage[i].charAt(j);
            if(c=='M'){
            ml=i;
            
            }
            if(c=='P'){
            pl=i;
            
            }
            if(c=='G'){
            gl=i;
            }
            ans++;
        }
      } 
      for(int j=0;j<ml;j++){
            ans+=travel[j];
        }
        for(int j=0;j<pl;j++){
            ans+=travel[j];
        }
        for(int j=0;j<gl;j++){
            ans+=travel[j];
        }
 
      return ans;
    }
}