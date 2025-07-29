class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans1=String.join("",word1);
        String ans2=String.join("",word2);
        if(ans1.equals(ans2)){
            return true;
        }
        else{
            return false;
        }
    }
}