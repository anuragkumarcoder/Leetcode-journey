class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int ans=-1;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<Integer>());
            }
            map.get(nums[i]).add(i);

        }
        for(int x : map.keySet()){
            int curr=0;
            ArrayList<Integer> list=map.get(x);
            if(list.size()>2){
                for(int i=0;i<list.size()-2;i++){
                    int a=list.get(i);
                    int b=list.get(i+1);
                    int c=list.get(i+2);
                    curr=Math.abs(a-b)+Math.abs(a-c)+Math.abs(b-c);
                    if(flag==false){
                        ans=curr;
                        flag=true;
                    }
                    ans=Math.min(ans,curr);
                }
            }
        }
        return ans;
    }
}