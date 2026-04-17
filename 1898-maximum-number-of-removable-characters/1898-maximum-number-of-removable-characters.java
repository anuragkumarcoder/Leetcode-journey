class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int high=removable.length;
        int low=0;
        char[] schar=s.toCharArray();
        char[] pchar=p.toCharArray();
        int mid=0;
        int ans=-1;
        while(high>=low){
            mid=low+(high-low)/2;
            boolean[] flag=new boolean[s.length()];

            for(int i=0;i<mid;i++){

                flag[removable[i]]=true;
            }
            int pptr=0;
            for(int i=0;i<s.length();i++){
                if(pptr<p.length() && !flag[i] && schar[i]==pchar[pptr]){
                    pptr++;
                }
            }
            if(pptr==p.length()){
                ans=mid;
                low=mid+1;

            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}