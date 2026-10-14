class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int arr[]=new int[num];
        if(num*9<sum){
            return "";
        }
        int ind=0;
        while(sum>0){
            if(sum>9){
                arr[ind++]=9;
                sum-=9;
            }else{
                arr[ind++]=sum;
                sum=0;
            }
        }
        StringBuilder st=new StringBuilder("");
        for(int x : arr){
            st.append(x);
        }
        return st.toString();

    }
}