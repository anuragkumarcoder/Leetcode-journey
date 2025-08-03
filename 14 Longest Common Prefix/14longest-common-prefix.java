class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        
        if(strs==null|| strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0].toString();
        }
        for(int i=0;i<strs[0].length();i++){
             char curr=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()||curr!=strs[j].charAt(i)){
                    return sb.toString();
                }
                
            }
            sb.append(curr);
            
        }
        return strs[0].toString();
    }
}