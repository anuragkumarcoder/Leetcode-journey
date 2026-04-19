class Solution {
    public boolean canAliceWin(int[] nums) {
        int a=0;
        int b=0;
        for(int x : nums){
            if(x>9) a+=x;
            else{
                b+=x;
            }
        }
        if(a==b) return false;
        return true;
    }
}