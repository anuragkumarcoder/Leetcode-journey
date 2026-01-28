class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int left=0;
        int count=0;
        int currlen=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;

            }
            currlen++;
           
            if(currlen>k){
                if(s.charAt(left)=='a'||s.charAt(left)=='e'||s.charAt(left)=='i'||s.charAt(left)=='o'||s.charAt(left)=='u'){
                    count--;
                }
                left++;
                currlen--;
                
            }
            if (currlen == k) {
                max = Math.max(count, max);
            }
        }
        return max;
    }
}