class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        String firsthalf=s.substring(0,mid);
        String secondhalf=s.substring(mid);
        int[] count={0,0};
        for(int i=0;i<firsthalf.length();i++){
            char c=Character.toLowerCase(firsthalf.charAt(i));
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count[0]++;
            }
        }
        for(int i=0;i<secondhalf.length();i++){
            char c=Character.toLowerCase(secondhalf.charAt(i));
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count[1]++;
            }
        }
        return count[0]==count[1];
        
    }
}