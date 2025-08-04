class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        int idx=arr.length-1;
        return arr[idx].length();

        
    }
}