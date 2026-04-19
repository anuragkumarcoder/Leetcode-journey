class Solution {
    public boolean isSubstringPresent(String s) {
        int n=s.length()-1;
        String rev= new StringBuilder(s).reverse().toString();
        for(int i=0;i<s.length()-1;i++){
            String curr=s.substring(i,i+2);
            if(rev.contains(curr)){
                return true;
            }
        }
        return false;
        
    }
}