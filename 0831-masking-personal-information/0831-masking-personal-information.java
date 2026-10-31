class Solution {
    public String maskPII(String s) {
        boolean flag = s.contains(String.valueOf("@"));
        HashSet <Character> set= new HashSet<>(Arrays.asList('+', '-', '(', ')', ' '));
        StringBuilder sb = new StringBuilder();
        
            for(char x : s.toCharArray()){
                if(set.contains(x)){continue;}
                sb.append(Character.toLowerCase(x));
                
            }
            if(flag){
                int at = sb.indexOf("@");
                sb=sb.replace(1,at-1,"*****");
            }else{
                int ind=0;
                int n=sb.length();
                
                for(int i=n-1;i>=0;i--){
                    ind++;
                    if(i>=n-4){
                        
                        continue;
                    }
                    if(i>=n-10){
                        sb.setCharAt(i,'*');
                        
                    }
                    if(ind==5||ind==8){
                        sb.insert(i+1,"-");
                        
                        continue;
                    }

                    
                }
               
                    if(sb.length()==12){
                        return sb.toString();
                    }
                     sb.insert(0,"+");
                     if(sb.length()==14){
                        sb.setCharAt(1,'*');
                        sb.insert(2,"-");

                     }
                     else if(sb.length()==15){
                         sb.setCharAt(1,'*');
                          sb.setCharAt(2,'*');

                        sb.insert(3,"-");

                     }else{
                        sb.setCharAt(1,'*');
                          sb.setCharAt(2,'*');
                          sb.setCharAt(3,'*');
                         sb.insert(4,"-");
                     }
            }
            
        return sb.toString();

    }
}