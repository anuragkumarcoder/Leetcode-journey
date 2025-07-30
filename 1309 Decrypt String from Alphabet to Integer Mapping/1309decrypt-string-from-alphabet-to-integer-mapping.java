class Solution {
    public String freqAlphabets(String s) {
        int i=0;
        StringBuilder sb=new StringBuilder ();
        while(i<s.length()){
            if( (i+2)<s.length() && s.charAt(i+2)=='#' ){
                String str=s.substring(i,i+2);
                int temp=Integer.parseInt(str);
                char ch=(char)(temp+96);
                sb.append(ch);
                i+=3;
            }
            else{
                int num=s.charAt(i)-'0';
                char ch=(char)(num+96);
                sb.append(ch);
                i++;
            }
        }
        String ans=sb.toString();
        return ans;
    }
}