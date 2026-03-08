class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res=new ArrayList<>();
        List<Integer> sorted=new ArrayList<>();
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            int y=binaryS(sorted,nums[i]);
            sorted.add(y,nums[i]);
            res.add(y);

        }
        Collections.reverse(res);
        return res;


    }
    private int binaryS(List<Integer> list,int target){
        int high=list.size();
        int low=0;
        while(low<high){
            int mid=low+(high-low)/2;
            if(list.get(mid)<target){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return high;
    }
}