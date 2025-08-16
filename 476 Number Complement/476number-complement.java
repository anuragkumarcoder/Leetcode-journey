class Solution {
    public int findComplement(int num) {
        List <Integer> ans=new ArrayList<>();
        while(num>0){
            int last=num&1;
            if(last==0){
                last=1;
                ans.add(last);
            }
            else{
                last=0;
                ans.add(last);
            }
            num=num>>1;
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