class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int x : freq){
                    if(x>0){
                        max=Math.max(max,x);
                        min=Math.min(min,x);
                    }
                   
                   

                }
                 if(max==Integer.MIN_VALUE){
                        ans+=0;
                    }else{
                         ans+=(max-min);
                    }
    
                
            }
        }
        return ans;
    }
}