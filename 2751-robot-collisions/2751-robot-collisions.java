class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Stack<Integer> st=new Stack<>();
        int n=positions.length;
        Integer[] indices=new Integer[n];
        for(int i=0;i<n;i++){
            indices[i]=i;
        }
        Arrays.sort(indices,((a,b)->positions[a]-positions[b]));
        for(int i : indices){
            if(directions.charAt(i)=='R') st.push(i);
            else{
                while(!st.isEmpty() && directions.charAt(st.peek())=='R' && healths[i] > 0){
                    int top=st.peek();
                    if(healths[top]==healths[i]){
                        healths[top]=0;
                        healths[i]=0;
                        st.pop();
                    }
                    else if(healths[top]>healths[i]){
                        healths[top]--;
                        healths[i]=0;
                    }
                    else{
                        healths[top]=0;
                        st.pop();
                        healths[i]--;
                    }
                }
                if(healths[i]>0){
                    st.push(i);
                }
            }
            
            
        }
        List<Integer> list=new ArrayList<>();
        for(int x : healths){
            if(x!=0){
                list.add(x);
            }
        }
        return list;

    }
}