class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        boolean flag=false;
        int ans=0;
        for(char x : map.keySet()){
            if(map.get(x)%2==0){
                ans+=map.get(x);
            }
            if(map.get(x)%2==1){
                if(flag==false){
                    ans+=map.get(x);
                    flag=true;
                }    
                else{
                    ans+=map.get(x)-1;
                }
                
            }
        } 
        return ans;  
    }
}