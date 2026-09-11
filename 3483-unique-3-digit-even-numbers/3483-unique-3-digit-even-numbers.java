class Solution {
    int curr=0;
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        
        helper(set,digits,curr,0,new boolean[digits.length]);
        return set.size();
    }
    void helper(HashSet<Integer> set,int[] digits,int curr,int ind,boolean[] visited){
        if(curr>=100){
            if(curr%2==0) set.add(curr);
            curr=0;
            return;
        }
        for(int i=0;i<digits.length;i++){
            if(visited[i]){
                continue;
            }
            if(ind==0 && digits[i]==0){
                continue;
            }
            visited[i]=true;
            curr=curr*10+digits[i];
            helper(set,digits,curr,ind+1,visited);
            curr/=10;
            visited[i]=false;
        }
    }
}