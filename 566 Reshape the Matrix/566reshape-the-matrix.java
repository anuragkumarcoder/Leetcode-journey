class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        List <Integer> list=new ArrayList<>();
        int[][] arr=new int[r][c];
        for(int i=0;i<mat.length;i++){
            for(int j=0; j<mat[i].length;j++){
                list.add(mat[i][j]);
            }
        }
        int index=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=list.get(index++);
            }
        }


        return arr;
    }
}