class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] arr=new String[str.length];
        for(int i=0;i<str.length;i++){
            String words=str[i];
            int pos=words.charAt(words.length()-1)-'1';
            arr[pos]=words.substring(0,words.length()-1);

        }
        return String.join(" ",arr);
    }
}