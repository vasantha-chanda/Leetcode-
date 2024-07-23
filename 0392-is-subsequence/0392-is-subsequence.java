class Solution {
    public boolean isSubsequence(String s, String t) {
         int t1=0;
         int t2=0;
        if(s.length() == 0) return true;
         for( int i=0;i<t.length();i++){
             if(t1 < s.length() && t.charAt(i) == s.charAt(t1)){
                 t2++;
                 t1++;
             }
         }
        if(t2 == s.length()){
            return true;
        }
        else return false;
    }
}