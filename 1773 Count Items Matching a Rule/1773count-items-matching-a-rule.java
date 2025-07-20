class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++){
          List <String> currlist=items.get(i);  
            if(ruleKey.equals("type")&& ruleValue.equals(currlist.get(0))){
                count++;

            }
             if(ruleKey.equals("color")&& ruleValue.equals(currlist.get(1))){
                count++;
             }
             if(ruleKey.equals("name")&& ruleValue.equals(currlist.get(2))){
                count++;
             }

        }
        return count;
        
    }
}