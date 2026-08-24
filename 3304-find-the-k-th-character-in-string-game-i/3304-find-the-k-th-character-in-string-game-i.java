class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb= new StringBuilder("a");
        while(sb.length()<k){
            int len=sb.length();
            for(int i=0;i<len;i++){
                char ch=sb.charAt(i);
                sb.append((char)('a'+(ch+1-'a')%26));
            }
        }
        return sb.charAt(k-1);
    }
}