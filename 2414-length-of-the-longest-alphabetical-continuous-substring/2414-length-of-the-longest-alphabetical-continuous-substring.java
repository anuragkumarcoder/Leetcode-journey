class Solution {
    public int longestContinuousSubstring(String s) {
        int ans=1;
        int curr=1;
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            char y=s.charAt(i+1);
            if((int)c+1==(int)y){
                curr++;
                ans=Math.max(ans,curr);
            }else{
                curr=1;
            }
        }
        return Math.max(ans,curr);
    }
}