class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int r=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'  && r+1!=l ){
                r++;
            }
                
            else if(s.charAt(i)=='L' && l+1!=r){
                l++;
            }
            else if(s.charAt(i)=='L' && l+1==r){
                ans++;
                r=0;
                l=0;
            }
            else if(s.charAt(i)=='R' && l==r+1){
                ans++;
                r=0;
                l=0;
            }
                
            
        }
        return ans;
    }
}