class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb=new StringBuilder ("");
        StringBuilder sc=new StringBuilder(s);
        for(int i=0;i<order.length();i++){
            char c=order.charAt(i);
            for(int j=0;j<sc.length();){
                if(c==sc.charAt(j)){
                    sb.append(c);
                    sc.deleteCharAt(j);
                    
                }
                else{
                    j++;
                }

            }
        }
        for(int i=0;i<sc.length();i++){
            sb.append(sc.charAt(i));
        }
        return sb.toString();
    }
}