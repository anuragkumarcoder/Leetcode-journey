class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        int sum1=0;
        for(char c : s.toCharArray()){
            sum+=(int)c;
        }
        for(char c : t.toCharArray()){
            sum1+=(int)c;
        }
        return (char)(sum1-sum);
    }
}