class Solution {
    public boolean rotateString(String s, String goal) {
        String x=s+s;
        if(s.length()!=goal.length()) return false;
        return x.contains(goal);
    }
}