class Solution {
    public int maxPoints(int[][] points) {
        int n=points.length;
        if(n<=2){
            return n;
        }
        int maxTotal=0;
        for(int i=0;i<n;i++){
            HashMap<String,Integer> map=new HashMap<>();
            int overlap=0;
            int currMax=0;
            for(int j=i+1;j<n;j++){
                int dx=points[j][0]-points[i][0];
                int dy=points[j][1]-points[i][1];
                if(dx==0 && dy==0){
                    overlap++;
                    continue;
                }
                int common=gcd(dx,dy);
                dx/=common;
                dy/=common;
                String s=dy+"/"+dx;
                map.put(s,map.getOrDefault(s,0)+1);
                currMax=Math.max(currMax,map.get(s));
            }
            maxTotal=Math.max(currMax+1+overlap,maxTotal);

        }
        return maxTotal;
    }
    private int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
        return a;
    }

}