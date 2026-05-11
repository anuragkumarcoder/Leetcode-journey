class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<n;i++){
            String temp=Integer.toString(nums[i]);
            for(int j=0;j<temp.length();j++){
                list.add(temp.charAt(j)-'0');
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}