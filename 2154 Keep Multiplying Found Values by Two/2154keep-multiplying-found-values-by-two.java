class Solution {
    public int findFinalValue(int[] nums, int original) {
      HashSet<Integer> set=new HashSet<>();
      for(int x:nums){
        set.add(x);
      }
      for(int x : set){
        if(set.contains(original)){
            original*=2;
        }
        else{
            break;
        }
      }
      return original;
    }
}