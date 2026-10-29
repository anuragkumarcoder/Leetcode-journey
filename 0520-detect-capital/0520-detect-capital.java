class Solution {
    public boolean detectCapitalUse(String word) {
       int count=0;
        for (char x : word.toCharArray()) {
            if (Character.isUpperCase(x)) {
                count++;
            }
        }
        if(count==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        if(count==word.length() || count==0){
            return true;
        }
        return false;
    }
}