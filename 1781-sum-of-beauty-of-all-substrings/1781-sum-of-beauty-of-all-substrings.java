class Solution {
    public int beautySum(String s) {
        List<String>substrings=listOfSubStrings(s);
            int sum=0;       
        for(String stri:substrings){
            
           int arr[]= frequencies(stri);
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;

           for(int v=0;v<26;v++)
               if(arr[v]!=0){
                      if(arr[v]>maxFreq)
                   maxFreq=arr[v];
               
                if(arr[v]<minFreq)
                   minFreq=arr[v];}
               
            sum+=(maxFreq-minFreq);
        }
        return sum;
    
    }
    static List<String> listOfSubStrings(String str){
        List<String>rs= new ArrayList<>();
        for(int i=0;i<str.length();i++){
            StringBuilder temp=new StringBuilder();
            for(int j=i;j<str.length();j++){
               temp.append(str.charAt(j));
               rs.add(temp.toString());
            }
        }
        return rs;
    }
    static int[] frequencies(String str){
        int charArr[]= new int[26];
        int n=str.length();
        for(int i=0;i<n;i++){
              charArr[str.charAt(i)-'a']++;
        }
        return charArr;
    }
}