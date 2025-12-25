class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
         int ans=0;
        for(int x : nums){
            if(x<10){
                set.add(x);
            }
            else{
                set.add(x);
                int rev=0;
                int temp=x;
                while(temp>0){
                    int n=temp%10;
                    rev=rev*10+n;
                    temp=temp/10;

                }
               set.add(rev);

            }
        }
        return set.size();
        
    }
}