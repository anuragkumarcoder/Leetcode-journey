class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     List <Integer> arr=new ArrayList<>();
     boolean[] used=new boolean[nums2.length];
     for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j] && !used[j]){
                arr.add(nums1[i]);
                used[j]=true;
                break;
            }
        }
     }
     int[] ans=new int[arr.size()];
     for(int i=0;i<arr.size();i++){
        ans[i]=arr.get(i);
     }
        return ans;
    }
}