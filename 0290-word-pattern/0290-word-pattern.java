class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character,String>patternMap=new HashMap<>();
         Map<String,Character>stringMap=new HashMap<>();
        String[] splittedstrings=s.split(" ");
        if(splittedstrings.length !=pattern.length()){
            return false;
        }
       
        for(int i=0;i<pattern.length();i++){
            if(patternMap.containsKey(pattern.charAt(i))){
                if(!patternMap.get(pattern.charAt(i)).equals(splittedstrings[i])){
                    return false;
                }
            }
             else{
                 patternMap.put(pattern.charAt(i),splittedstrings[i]);
             } 
        }
        for(int k=0;k<splittedstrings.length;k++){
            if(stringMap.containsKey(splittedstrings[k])){
                if(stringMap.get(splittedstrings[k])!=pattern.charAt(k)){
                    return false;
                }
            }
             else{
                 stringMap.put(splittedstrings[k],pattern.charAt(k));
             } 
        }
        
        return true;
        
        
    }
}