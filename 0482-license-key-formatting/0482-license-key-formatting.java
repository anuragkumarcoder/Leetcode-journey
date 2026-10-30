class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char x : s.toCharArray()){
            if(x=='-'){
                continue;
            }
            sb.append(Character.toUpperCase(x));
        }
        for(int i=sb.length()-k;i>0;i-=k){
            sb.insert(i,'-');
        }


        return sb.toString();


    }
}