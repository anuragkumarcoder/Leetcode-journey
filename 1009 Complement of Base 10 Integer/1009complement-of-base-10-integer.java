class Solution {
    public int bitwiseComplement(int n) {
        List <Integer> ans=new ArrayList<>();
        if(n==0){
            return 1;
        }
        while(n>0){
            int last=n&1;
            if(last==0){
                last=1;
                ans.add(last);
            }
            else{
                last=0;
                ans.add(last);
            }
            n=n>>1;
        }
         int base=1;
         int result=0;
        for(int i=0;i<ans.size();i++){
           
            result=result+ base*ans.get(i);
            base*=2;
        }
        return result;
    }
}