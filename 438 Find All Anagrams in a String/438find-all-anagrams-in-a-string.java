class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(p.length()>s.length()){
            return list;
        }
        int[] arr=new int [26];
        for(int i=0;i<p.length();i++){
            arr[p.charAt(i)-'a']++;
        }
        int[] curr=new int [26];
        for(int i=0;i<p.length();i++){
            curr[s.charAt(i)-'a']++;
        }
        int left=0;
        
        for(int i=p.length();i<s.length();i++){
            if(Arrays.equals(arr,curr)){
                list.add(left);
            }
            curr[s.charAt(i)-'a']++;
            curr[s.charAt(left++)-'a']--;

        }
          if(Arrays.equals(arr,curr)){
                list.add(left);
            }

        return list;
    }
}