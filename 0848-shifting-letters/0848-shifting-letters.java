class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long sum=0;
        for(int i=0;i<shifts.length;i++){
            sum+=shifts[i];
        }
        char[] res=s.toCharArray();
        for(int i=0;i<shifts.length;i++){
            long curr=sum;
            int ind=s.charAt(i)-'a';
            curr+=ind;
            curr=curr%26;
            res[i]=(char)(curr+'a');
            sum-=shifts[i];
        }
        return new String(res);
    }
}