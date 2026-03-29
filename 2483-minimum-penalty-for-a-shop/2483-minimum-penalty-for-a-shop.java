class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int curr=0;
        int min=0;
        int best=0;
        for(int i=0;i<n;i++){
            char c=customers.charAt(i);
            if(c=='Y'){
                curr--;
            }
            else{
                curr++;
            }
            if(curr<min){
                min=curr;
                best=i+1;
            }
        }
        return best;
    }
}