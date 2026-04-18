class Solution {
    public int countKeyChanges(String s) {
        int ans=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            char x=s.charAt(i+1);
            if(c!=x) ans++;
        }
        return ans;
    }
}