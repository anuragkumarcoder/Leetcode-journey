class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
             ArrayList<Integer> list=new ArrayList<>();
             int temp =i;
            if(temp>100){
                while(temp>0){
                    int x=temp%10;
                    list.add(x);
                    temp/=10;
                }
            }
            for(int j=1;j<list.size()-1;j++){
                int prev = list.get(j - 1);
                int curr = list.get(j);
                int next = list.get(j + 1);
                if ((curr > prev && curr > next) || (curr < prev && curr < next)) {
                    count++;
                }    
            }
        }
        
        return count;
    }
}