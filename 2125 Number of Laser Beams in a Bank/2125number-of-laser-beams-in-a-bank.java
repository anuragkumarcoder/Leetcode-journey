class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int prev=0;
        for(int i=0;i<bank.length;i++){
            int device=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    device++;
                }
                
            }
            if(device>0){
                ans+=prev*device;
                prev=device;
            }
        }
        return ans;
    }
}