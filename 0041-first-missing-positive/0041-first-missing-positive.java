class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Arrays.sort(nums);
int count=1;
        int k=0;
        
       while(k<nums.length){
           if(count == nums[k]){
               count++;
           }
           k++;
       }
        return count;
    }
}