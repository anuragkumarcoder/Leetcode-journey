class Solution {
    public List<String> letterCasePermutation(String s) {
       List<String> list=new ArrayList<>();
        helper(s, 0, new StringBuilder(),list);
        return list; 
    }
    void helper(String s,int ind,StringBuilder sb,  List<String> list){
        if(ind==s.length()){
            list.add(sb.toString());
            return;
        }
        char c=s.charAt(ind);
        if(Character.isDigit(c)){
            sb.append(c);
            helper(s,ind+1,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }else{
            sb.append(Character.toLowerCase(c));
            helper(s,ind+1,sb,list);
            sb.deleteCharAt(sb.length()-1);

            sb.append(Character.toUpperCase(c));
            helper(s,ind+1,sb,list);
            sb.deleteCharAt(sb.length()-1);



        }
    }
}