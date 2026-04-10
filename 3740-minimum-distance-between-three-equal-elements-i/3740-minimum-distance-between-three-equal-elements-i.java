class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int ans=-1;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }
            else{
                map.put(nums[i],new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }
        for(int x : map.keySet()){
            int curr=0;
            if(map.get(x).size()>2){
                for(int i=0;i<map.get(x).size()-2;i++){
                    Collections.sort(map.get(x));
                int a=map.get(x).get(i);
                int b=map.get(x).get(i+1);
                int c=map.get(x).get(i+2);
               
                curr=Math.abs(a-b)+Math.abs(b-c)+Math.abs(a-c);
                 if(flag==false){
                    ans=curr;
                    flag=true;
                }
                ans=Math.min(curr,ans);
                }
                
            }
        }
        return ans;
    }
}