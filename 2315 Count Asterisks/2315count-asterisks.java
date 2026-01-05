class Solution {
    public int countAsterisks(String s) {
        int bars=0;
        int curr=0;
        for(char c : s.toCharArray()){
            if(bars%2==0&& c=='*'){
                curr++;
            }
            if(c=='|'){
                
                bars++;
            }
        }
        return curr;
    }
}