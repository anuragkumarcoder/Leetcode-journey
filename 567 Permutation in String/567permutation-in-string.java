class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int[] arr=new int[26];
       if (s1.length() > s2.length()) return false;
       int ind=0;
       for(char c : s1.toCharArray()){
        arr[s1.charAt(ind++)-'a']++;
       } 
       int windowLen=s1.length();
       int[] curr=new int[26];
       for(int i=0;i<windowLen;i++){
            curr[s2.charAt(i)-'a']++;
       }
       int left=0;
       for(int i=windowLen;i<s2.length();i++){
           if(Arrays.equals(curr, arr)){
                return true;
            }
            curr[s2.charAt(left++)-'a']--;
            curr[s2.charAt(i)-'a']++;
            
            
       }
       return Arrays.equals(curr, arr);
    }
}