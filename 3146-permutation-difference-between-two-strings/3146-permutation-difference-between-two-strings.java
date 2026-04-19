class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] a=new int[26];
        int[] b=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            a[c-'a']=i;
            b[t.charAt(i)-'a']=i;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            ans+=Math.abs(a[i]-b[i]);
        }
        return ans;
    }
}