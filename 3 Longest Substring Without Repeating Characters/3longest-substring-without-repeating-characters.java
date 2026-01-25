class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int length=0;
        int max=0;
        int ind=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,i);
                max++;
                ans=Math.max(ans,max);
            }else{
                map.remove(s.charAt(ind++));
                i--;
                max--;
            }
           
        }
        return ans;
    }
}