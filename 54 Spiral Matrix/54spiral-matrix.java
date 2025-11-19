class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList <Integer> list=new ArrayList<>(); 
        int left=0;
            int right=matrix[0].length-1;
            int up=0;
            int down=matrix.length-1; 
        while(left<=right && up<=down){
            
            for(int i=left;i<=right;i++){
                list.add(matrix[up][i]);
               
            }
             up++;
            for(int j=up;j<=down;j++){
                list.add(matrix[j][right]);
             
            }
            
               right--;
            if(up<=down){
                for(int k=right;k>=left;k--){
                list.add(matrix[down][k]);
                }
                 down--;
            }
            if(left<=right){
                for(int l=down;l>=up;l--){
                list.add(matrix[l][left]);
                }
                left++;
            }
             
        }
                
        return list;
    }
}