class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=0;
        int n=0;
        List<Integer> list=new ArrayList<>();
        while(m!=nums1.length && n!=nums2.length){
            if(nums1[m]>nums2[n]){
                list.add(nums2[n++]);
            }
            else{
                list.add(nums1[m++]);
            }
        }
            while(n!=nums2.length){
                list.add(nums2[n++]);
            }
        
            while(m!=nums1.length){
                list.add(nums1[m++]);
            }
        int s = list.size();
        if(s % 2 != 0) {
            return (double)list.get(s / 2);
        } else {
            return (list.get(s / 2 - 1) + list.get(s / 2)) / 2.0;
        }        
    }
}