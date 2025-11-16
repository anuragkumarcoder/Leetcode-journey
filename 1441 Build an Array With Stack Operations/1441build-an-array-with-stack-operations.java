class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> ans=new ArrayList <>();
        int idx=0;
        for(int i=1;i<=n && idx<target.length;i++){
            if(i==target[idx]){
                ans.add("Push");
                idx++;
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;

    }
}