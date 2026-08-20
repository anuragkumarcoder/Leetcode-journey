class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set = new HashSet<>();
        for(String s : nums){
            set.add(s);
        }
         return helper(0,new StringBuilder(),set,nums.length);
    }
    public String helper(int idx,StringBuilder sb,HashSet<String> set,int n){
        if(idx==n){
            String s=sb.toString();
            if(!set.contains(s)){
                return s;
            }
            return null;
            
        }
        sb.append("0");
        String res=helper(idx+1,sb,set,n);
        if(res!=null){
            return res;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("1");
        res=helper(idx+1,sb,set,n);
        if(res!=null){
            return res;
        }
        sb.deleteCharAt(sb.length()-1);
        return null;
        
    }
}