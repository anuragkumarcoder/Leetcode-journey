class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        int[] arr=new int[set.size()];
        int ind =0;
        for(int x : set){
            arr[ind++]=x;
        }
        Arrays.sort(arr);
         if(arr.length<3){
            return arr[arr.length-1];
        }
        return arr[arr.length-3];
    }
}