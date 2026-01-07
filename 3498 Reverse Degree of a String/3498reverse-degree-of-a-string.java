class Solution {
    public int reverseDegree(String s) {
        int ind=1;
      int sum=0;
        for(char c : s.toCharArray()){
            int val=123-(int)c;
            sum+=val*ind;
            ind++;
        }
        return sum;
        
    }
}