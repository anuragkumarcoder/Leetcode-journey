class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(String st : words){
            StringBuilder sb = new StringBuilder("");
            for(int i=0;i<st.length();i++){
              char x=st.charAt(i);
                sb.append(arr[x-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}