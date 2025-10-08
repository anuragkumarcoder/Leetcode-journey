class Solution {
    public String convert(String s, int numRows) {
         if (numRows == 1 || s.length() <= numRows) return s;
        char[][] c=new char[numRows][s.length()];
        int row=0;
        int col=0;
        int count=0;
        while(count<s.length()){
            
            while(row<numRows && count<s.length()){
                c[row++][col]=s.charAt(count++);
            }
            col++;
            row-=2;
            while(row>0 && count<s.length()){
                c[row--][col++]=s.charAt(count++);
            }
        }
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<numRows;i++){
            for(int  j=0;j<s.length();j++){
                if(c[i][j]!='\u0000') ans.append(c[i][j]);
            }
        }
        return ans.toString();
    }
}