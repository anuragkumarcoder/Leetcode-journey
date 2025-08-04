class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.charAt(0)==ch){
            return word;
        }
        String s="";
        int idx=-1;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                 s=word.substring(0,i+1);
                 idx=i;
                 break;
            }
            
        }
        if(idx==-1){
            return word;
        }
            
        
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        sb.append(word.substring(idx+1));    
        return sb.toString();
    }
}