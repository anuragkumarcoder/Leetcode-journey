class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       List<Integer> l1=new ArrayList<>();
       List<Integer> l2=new ArrayList<>();
        List<Integer> l3=new ArrayList<>();
       for(int x : nums){
        if(x>pivot){
            l2.add(x);
        }else if(x<pivot){
            l1.add(x);
        }else{
            l3.add(pivot);
        }
       }
       int ind=0;
       for(int i=0;i<l1.size();i++ ){
        nums[ind++]=l1.get(i);
       }
       for(int x : l3){
        nums[ind++]=x;
       }
       for(int i=0;i<l2.size();i++){
        nums[ind++]=l2.get(i);
       }
       return nums;
    }
}