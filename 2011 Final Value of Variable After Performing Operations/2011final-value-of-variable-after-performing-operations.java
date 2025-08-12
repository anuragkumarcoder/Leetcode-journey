class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int count=0;
        for(int i=0;i<operations.length;i++){
             count+=oper(operations[i]);
        }
        return count;
    }
    static int oper(String s){
        if(s.charAt(0)=='+' || s.charAt(2)=='+'){
            return 1;
        }
        else if(s.charAt(0)=='-' || s.charAt(2)=='-'){
            return -1;
        }
        return 0;
    }
}