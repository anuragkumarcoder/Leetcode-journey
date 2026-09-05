class Solution {
    private String[] MAPPING = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  //9
    };
    public List<String> letterCombinations(String digits) {
        ArrayList<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");
        helper(result,digits,0,sb);
        return result;
        
    }
    void helper (List<String> result,String digits,int index,StringBuilder sb){
        if(index==digits.length()){
            result.add(sb.toString());
            return;
        }
        char ch=digits.charAt(index);
        String st=MAPPING[ch-'0'];
        for(int i=0;i<st.length();i++){
            sb.append(st.charAt(i));
            helper(result,digits,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}













