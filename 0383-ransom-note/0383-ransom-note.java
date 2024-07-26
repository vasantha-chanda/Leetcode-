class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         Map<Character,Integer>map1=new HashMap<>();
        Map<Character,Integer>map2=new HashMap<>();
        
        for(int i=0;i<ransomNote.length();i++){
            if(map1.containsKey(ransomNote.charAt(i))){
                map1.put(ransomNote.charAt(i),map1.get(ransomNote.charAt(i))+1);
            }
            else{
                map1.put(ransomNote.charAt(i),1);
            }
        }
         for(int k=0;k<magazine.length();k++){
            if(map2.containsKey(magazine.charAt(k))){
                map2.put(magazine.charAt(k),map2.get(magazine.charAt(k))+1);
            }
            else{
                map2.put(magazine.charAt(k),1);
            }
        }
        
        for(Map.Entry<Character,Integer> entry:map1.entrySet()){
            char c=entry.getKey();
            int count = entry.getValue();
            if (map2.getOrDefault(c, 0) < count) {
                return false;
            }
        }
        
        return true;
    }
}