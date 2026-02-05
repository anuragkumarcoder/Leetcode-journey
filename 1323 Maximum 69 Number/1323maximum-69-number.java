class Solution {
    public int maximum69Number (int num) {
        List<Integer> list=new ArrayList<>();
        while(num>0){
            list.add(num%10);
            num/=10;
        }
        int n=0;
        boolean flag=true;
        int x=list.size()-1;
        for(int i=x;i>=0;i--){
            if(list.get(i)==6 && flag==true){
                n=n*10+9;
                flag=false;
            }else{
                n=n*10+list.get(i);
            }
            
        }
        return n;
    }
}