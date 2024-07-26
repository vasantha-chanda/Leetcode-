class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>map1=new HashMap<>();
          Map<Character,Integer>map2=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char str=s.charAt(i);
            map1.put(str,map1.getOrDefault(str,0)+1);
        }
         for(int k=0;k<t.length();k++){
            char st=t.charAt(k);
            map2.put(st,map2.getOrDefault(st,0)+1);
        }
        
        for(Map.Entry<Character,Integer>entry:map1.entrySet()){
            char c=entry.getKey();
            int count=entry.getValue();
            if(count!=map2.getOrDefault(c,0)){
                return  false;
            }
        }
        return true;
        
    }
}