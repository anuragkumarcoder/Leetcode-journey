class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    arr.add(nums1[i]);  
                }
            }
        }
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i).equals(arr.get(j))){
                    arr.remove(j);
                    j--;
                }

            }
        }
        int[] result=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            result[i]=arr.get(i);
        }
        return result;
    }
}