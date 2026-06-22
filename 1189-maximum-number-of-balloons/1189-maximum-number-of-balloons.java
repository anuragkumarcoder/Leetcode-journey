class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr=new int[5];
        for(char x : text.toCharArray()){
            if(x =='b'){
                arr[0]+=2;
            }else if(x == 'a'){
                arr[1] += 2;
            }else if( x == 'l'){
                arr[2] += 1;
            }else if( x == 'o'){
                arr[3] +=1;
            }else if(x == 'n'){
                arr[4] += 2;
            }
        }
        Arrays.sort(arr);
        return arr[0]/2;
    }
}