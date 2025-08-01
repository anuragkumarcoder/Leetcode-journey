class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        int n=columnNumber;
        while(n>0){
            n--;
        char ch=(char)('A'+n%26);
        sb.append(ch);
        n/=26;

        }
        return sb.reverse().toString();
        
    }
}