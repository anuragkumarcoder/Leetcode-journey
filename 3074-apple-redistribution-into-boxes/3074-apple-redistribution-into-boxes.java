class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;
        for (int a : apple) {
            totalApples += a;
        }
        Arrays.sort(capacity);
        
        int boxUsed = 0;
        int n = capacity.length;
        for(int i=n-1;i>=0;i--){
            totalApples-=capacity[i];
            boxUsed++;
            if (totalApples <= 0) {
                return boxUsed;
            }
        }
        return boxUsed;
    }
}