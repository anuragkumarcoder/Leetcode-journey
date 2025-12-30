class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       
        List<Integer> list=new ArrayList<>();
        while(left<=right){
             boolean flag=true;
            int y=left;
            while(y>0){
                int x=y%10;
                y/=10;
                if(x==0 ||left%x!=0){
                    flag=!flag;
                    break;
                }
                else{
                    continue;
                }
            }
            if(flag){
                list.add(left);
            }
            left++;
        }
        return list;
    }
}