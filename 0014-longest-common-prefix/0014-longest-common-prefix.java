class Solution {
     public static String longestCommonPrefix(String[] strs) {
        String str= strs[0];
         StringBuilder strbuilder = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
              for(int k=1;k<strs.length;k++){
                  if(i>=strs[k].length() || strs[k].charAt(i)!= c){
                     return strbuilder.toString(); 
                  }
              }
            strbuilder.append(c);
        }
        return strbuilder.toString();
    }
}