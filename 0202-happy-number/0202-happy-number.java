class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1){
             if(!set.contains(n)){
                 set.add(n);
             }
            else{
                return  false;
            }
            n=sumSquareDigit(n);
        }
       return true;
        
    }
    public int sumSquareDigit(int k){
        int sum=0;
        while(k>0){
sum+=(k%10)*(k%10);
            k=k/10;
            
        }
         return sum;
    }
   
}