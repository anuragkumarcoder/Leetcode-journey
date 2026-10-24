class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] arr=new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int one=Integer.parseInt(arriveAlice.substring(0,2));
        int four=Integer.parseInt(leaveAlice.substring(3,5));
        int five=Integer.parseInt(arriveBob.substring(0,2));
        int eight=Integer.parseInt(leaveBob.substring(3,5));
        int two=Integer.parseInt(arriveAlice.substring(3,5));
        int three=Integer.parseInt(leaveAlice.substring(0,2));
        int six=Integer.parseInt(arriveBob.substring(3,5));
        int seven=Integer.parseInt(leaveBob.substring(0,2));
        for(int i=0; i<one-1; i++) two+=arr[i];
        for(int i=0; i<three-1; i++) four+=arr[i];
        for(int i=0; i<five-1; i++) six+=arr[i];
        for(int i=0; i<seven-1; i++) eight+=arr[i];

        int max=Math.max(two,six);
        int min=Math.min(four,eight);
        int ans=min-max+1;

        if(ans<0) return 0;
        return ans;
        
    }
}