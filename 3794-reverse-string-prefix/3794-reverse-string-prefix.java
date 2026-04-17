class Solution {
    public String reversePrefix(String s, int k) {
        char[] x=s.toCharArray();
        for(int i=0;i<k/2;i++){
            char c=x[i];
            x[i]=x[k-1-i];
            x[k-i-1]=c;
        }
        return new String(x);
    }
}