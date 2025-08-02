class Solution {
    public boolean isPalindrome(String s) {
        String orig=s.strip();
        orig=orig.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left=0;
        int right=orig.length()-1;

        while(left<right){
            if(orig.charAt(left)==orig.charAt(right)){
            left++;
            right--;
            }
            else{
            return false;
            }
        }
        return true;
    }
}