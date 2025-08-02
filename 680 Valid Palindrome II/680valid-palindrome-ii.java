class Solution {
    public boolean validPalindrome(String s) {
        int count=0;
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else if(ispalindrome(s,left+1,right) || ispalindrome(s,left,right-1)){
                return true;
            }
            else{
                return false;
            }
            
        }
       
         return true;
    }
    private static boolean ispalindrome(String s,int left,int right){
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    return false;

                }
                else{
                    left++;
                    right--;
                }
            }
            return true;
    }       
    
}