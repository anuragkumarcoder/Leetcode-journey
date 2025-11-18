class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[m+n];
        int i=0;
        int j=0;
        int count=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                
                    ans[count]=nums1[i];
                    count++;
                    i++;
                
            }
            else if(j<n && nums1[i]>nums2[j]){
                
                    ans[count]=nums2[j];
                    count++;
                    j++;
                
            }
            else{
                ans[count++]=nums1[i++];
                ans[count++]=nums2[j++];
            }
        }
        while(i<m){
        ans[count++]=nums1[i++];
        }
        while(j<n){
        ans[count++]=nums2[j++];
        }
        for(int k=0;k<m+n;k++){
            nums1[k]=ans[k];
        }
    }
}