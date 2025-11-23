class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer>map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int i=0;
        int[] arr=new int[map.size()];
        for(int n:map){
            arr[i++]=n;
        }
        i=0;
         Arrays.sort(arr);
         for(int n:arr){
            nums[i++]=n;
         }
         return arr.length;
    }
}