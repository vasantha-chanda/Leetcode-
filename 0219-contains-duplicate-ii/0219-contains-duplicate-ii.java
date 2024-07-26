class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         for(int i=0;i<nums.length;i++){
             
             for(int p=i+1;p<=i+k && p<nums.length;p++){
                 
                 if(nums[i]==nums[p]){
                     return true;
                 }
             }
         }
        return false;
    }
}