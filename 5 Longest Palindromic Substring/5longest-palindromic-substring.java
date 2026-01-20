class Solution {
    public int helper(String s,int st,int e) {
        int len=0;
        while(st>=0 && e<s.length() && s.charAt(st)==s.charAt(e)){
            st--;
            e++;

        }
        return e-st-1;

    }

    public String longestPalindrome(String s) {
        int st=0;
        int e=0;
        String ans = "";
        if(s.length()<1){
            return "";
        }
        for (int i= 0;i< s.length(); i++) {
           int l1=helper(s,i,i);
           int l2=helper(s,i,i+1);
           int len=Math.max(l1,l2);
           if(len>e-st){
            st=i-(len-1)/2;
            e=i+len/2;
           }
        }
        return s.substring(st,e+1);
    }
}