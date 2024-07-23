class Solution {
    public boolean isPalindrome(String s) {
     
        String small=s.toLowerCase();
        String orginal=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
           StringBuffer str= new StringBuffer(small).reverse();
           
        String revrsedString=str.toString().replaceAll("[^a-zA-Z0-9]","");
    System.out.println(revrsedString);
         System.out.println(orginal);
        if(orginal.equals(revrsedString)){
            return true;
        }
        return false;
    }

}