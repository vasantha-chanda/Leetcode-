class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char m1=s.charAt(i);
            char m2=t.charAt(i);
            if(map1.containsKey(m1)){
                

            if(map1.get(m1)!=m2){
                
                return false;
            }
                
            }
            else{
                map1.put(m1,m2);
            }
            
           
            
        }
  for(int k=0;k<t.length();k++){
           char k1=s.charAt(k);
          char k2=t.charAt(k);
            if(map2.containsKey(k2)){
                
            
            if(map2.get(k2)!=k1){
               return false;
           }}
            else{
                   map2.put(k2,k1);
            }
         
               
        }
        return true;
    }
}