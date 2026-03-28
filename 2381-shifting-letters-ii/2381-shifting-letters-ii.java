class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1];
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int val;
            if (shift[2] == 1) {
                val = 1;
            } else {
                val = -1;
            }
            diff[start] += val;
            diff[end + 1] -= val;
        }
        char[] chars = s.toCharArray();
        int currentShift = 0;
        for(int i=0;i<n;i++){
            currentShift+=diff[i];
            int netShift=currentShift%26;
            int pos=chars[i]-'a';
            int newpos=pos+netShift;
            if(newpos<0){
                newpos+=26;
            }
            if(newpos>=26){
                newpos-=26;
            }
            chars[i]=(char)(newpos+'a');
        }
        return new String(chars);
    }
}