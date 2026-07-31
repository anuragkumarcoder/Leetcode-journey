class Solution {
    public int minimumPushes(String word) {
        Integer[] freq =new Integer[26];
         Arrays.fill(freq,0);
        for(char c : word.toCharArray()){
            freq[c-'a']++;
        }
        int ans=0;
       
        Arrays.sort(freq,Collections.reverseOrder());
        for(int i =0;i<8;i++){
            ans+=freq[i];
        }
         for(int i =8;i<16;i++){
            ans+=(freq[i]*2);
        }
        for(int i =16;i<24;i++){
            ans+=(freq[i]*3);
        }
        for(int i =24;i<26;i++){
            ans+=(freq[i]*4);
        }
        return ans;

    }   
}