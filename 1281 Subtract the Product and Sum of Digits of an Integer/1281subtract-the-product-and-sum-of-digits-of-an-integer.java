class Solution {
    public int subtractProductAndSum(int n) {
        List<Integer> list=new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n=n/10;
        }
        int pro=1;
        int sum=0;
        for(int x : list){
            sum+=x;
            pro*=x;
        }
        return pro-sum;
        
    }
}