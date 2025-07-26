class Solution {
    public boolean isPerfectSquare(int num) {
        double root = Math.sqrt(num);
        return (root/(int)root == 1);
    }
}
        

