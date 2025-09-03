class Solution {
    public String sortVowels(String s) {
        String vowels="aeiouAEIOU";
        List<Character> vowellist=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vowels.indexOf(ch)!=-1){
                vowellist.add(ch);
            }
        }
        Collections.sort(vowellist);
        StringBuilder sb=new StringBuilder();
        int  idx=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(vowels.indexOf(curr)!=-1){
                sb.append(vowellist.get(idx));
                idx++;
            }
            else{
                sb.append(curr);
            }

            
        }
        return sb.toString();
            
    }
}