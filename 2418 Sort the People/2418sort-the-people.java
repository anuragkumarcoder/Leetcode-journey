class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new  HashMap<>();
        String[] s=new String [names.length];
        int n=names.length;
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int ind=0;
        for(int i =n-1;i>=0;i--){
            s[ind++]=map.get(heights[i]);
        }
        return s;

    }
}