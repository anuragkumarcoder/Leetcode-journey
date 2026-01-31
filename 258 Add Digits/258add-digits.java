class Solution {
    public int helper(int nums){
        int x=0;
        while(nums>0){
            x+=nums%10;
            nums/=10;
            

        }
        return x;
    }
    public int addDigits(int num) {
        while(num>9){
            num=helper(num);
        }
        return num;
            
        
    }
}