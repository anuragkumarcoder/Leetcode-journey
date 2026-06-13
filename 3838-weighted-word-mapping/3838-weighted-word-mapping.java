class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<words.length;i++){
            int x=0;
            for(char c : words[i].toCharArray()){
                x+=weights[c-'a'];
            }
            char c=(char)(97+25-(x%26));
            st.append(c);
        }
        return st.toString();
    }
}