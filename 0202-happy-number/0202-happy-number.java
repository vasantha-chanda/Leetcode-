class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=sumSquareDigit(slow);
        fast=sumSquareDigit(sumSquareDigit(fast));
        }while(slow!=fast);
        
        
       
        return slow == 1;
        
    }
   
    public int sumSquareDigit(int k) {
        int sum = 0;
        while (k > 0) {
            int digit = k % 10;
            sum += digit * digit;
            k /= 10;
        }
        return sum;
    }
   
}