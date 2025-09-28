class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb=new StringBuilder("");
        int count =0;
        int idx=0;
        while(idx<s.length()){
            char c=s.charAt(idx++);
            if(c==' ') {
                count++;
                if(count==k) break;
                
                sb.append(c);
            }
            
            else{
                sb.append(c);
            }
        }
        return sb.toString();

    }
}