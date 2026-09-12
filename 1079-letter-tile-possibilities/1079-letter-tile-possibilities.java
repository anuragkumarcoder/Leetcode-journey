class Solution {
    public int numTilePossibilities(String tiles) {
        HashSet<String> set =new HashSet<>();
        StringBuilder sb =new StringBuilder("");
        char[] arr=tiles.toCharArray();
        boolean[] f=new boolean[arr.length];
        helper(set,sb,arr,0,f);
        return set.size();
    }
    void helper(HashSet<String> set,StringBuilder sb,char[] arr,int ind,boolean[] f){
       
        for(int i=0;i<arr.length;i++){
            if(f[i]){
                continue;
            }
             
            sb.append(arr[i]);
            set.add(sb.toString());
            ind++;
            f[i]=true;
            helper(set,sb,arr,ind,f);
            sb.deleteCharAt(sb.length()-1);
            ind--;
            f[i]=false;
        }
    }
}