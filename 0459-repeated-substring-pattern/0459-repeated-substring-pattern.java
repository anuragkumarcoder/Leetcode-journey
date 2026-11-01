class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        boolean flag=false;
        for(int i=1;i<=s.length()/2;i++){
            if(s.length()%i!=0) continue;
            int ind=i;
            ArrayList<Character> list = new ArrayList<>();
            for(int k=0;k<i;k++){
                list.add(s.charAt(k));
            }
            flag=true;
            for(int j=i;j<s.length();j++){
                if(list.get(j%i)!=s.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag) return true;
            

        }
        return flag;
    }
}