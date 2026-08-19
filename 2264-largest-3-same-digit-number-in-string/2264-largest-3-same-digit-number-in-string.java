class Solution {
    public String largestGoodInteger(String num) {
        int max=-1;
        boolean flag=false;
        int hook=-1;
        String ans="";
        for(int i =0;i<=num.length()-3;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                int curr=num.charAt(i)-'0';
                if(max<curr){
                    max=curr;
                    hook=i;
                }

                
                    flag=true;
                
            }
        }
        if(flag){
            ans=num.substring(hook,hook+3);
        }
        return ans;
    }
}