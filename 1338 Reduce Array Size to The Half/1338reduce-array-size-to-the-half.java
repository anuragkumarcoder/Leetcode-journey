class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        List<Integer> freq=new ArrayList<>(map.values());
        int half=arr.length/2;
        int count =0;
        int removed=0;
        Collections.sort(freq,Collections.reverseOrder());
        for(int x: freq){
        
            removed+=x;
            count++;
            if(removed>=half){
                break;
            }
        }
        return count;

    }
}