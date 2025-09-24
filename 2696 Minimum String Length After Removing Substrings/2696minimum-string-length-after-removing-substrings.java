class Solution {
    public int minLength(String s) {
        String a="AB";
        String b="CD";
        while(s.contains(a)|| s.contains(b)){
            s=s.replace(a,"");
            s=s.replace(b,"");


        }
        return s.length();
    }
}