class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
     while(start<=end){
        if(start==letters.length-1){
            return letters[0];
        }
        int mid=end-(end-start)/2;
        
        if(target>=letters[mid]){
            start=mid+1;
        }
        else if(target<letters[mid]){
          
             end=mid-1;

        }
      }  
      return letters[start];
    }
}