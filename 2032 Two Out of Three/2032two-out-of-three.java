class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i : set1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        for(int i : set2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer> set3=new HashSet<>();
        for(int i=0;i<nums3.length;i++){
            set3.add(nums3[i]);
        }
        for(int i : set3){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int x : map.keySet()){
            if(map.get(x)>=2){
                list.add(x);
            }
        }
        return list;
    }
}