class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int x=(char)s.charAt(i);
            int y=(char)s.charAt(i+1);
            if(x>=y){
                sum+=x-y;
            }
            else{
                sum+=y-x;
            }
        }
        return sum;
    }
}