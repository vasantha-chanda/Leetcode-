class Solution {
    static boolean isNonDecreasing(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1])
                return false;
        }
        return true;
    }
    static void rotate(int[] nums){
        if(nums.length>0){
            int temp = nums[0];
            int i;
            for(i = 0; i<nums.length-1;i++){
                nums[i] = nums[i+1];
            }
            nums[i] = temp;
        }
    }
    public boolean check(int[] nums) {
        for(int i=0;i<nums.length;i++){
            rotate(nums);
            if(isNonDecreasing(nums)){
                return true;
            }
        }
        return false;
    }
}