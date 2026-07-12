class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if(n==0){
            return arr;
        }
        int[][] nums =new int[n][2];
        int[] dummy =new int[n];
        int ind = 0;
        for(int x : arr){
            dummy[ind++]=x;
        }
        int rank =1;
        Arrays.sort(dummy);
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<n;i++){
            if (!map.containsKey(dummy[i])) {
                map.put(dummy[i], rank++);
            }
           
        }
        for(int i=0;i<n;i++){
            dummy[i]=map.get(arr[i]);
        }
        return dummy;
    }
}