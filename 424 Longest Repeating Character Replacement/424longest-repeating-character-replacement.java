class Solution {
    public int characterReplacement(String s, int k) {
      int[] freq=new int[26];
      int left=0;
      int maxFreq=0;
      int maxLen=0;
      for(int right=0;right<s.length();right++){
        freq[s.charAt(right)-'A']++;
        maxFreq=Math.max( freq[s.charAt(right)-'A'],maxFreq);
        int windowLen=right-left+1;
        if(windowLen-maxFreq>k){
             freq[s.charAt(left)-'A']--;
             left++;
        } 
        windowLen=right-left+1;
        maxLen=Math.max(maxLen,windowLen);
      }
      return maxLen;

    }
}