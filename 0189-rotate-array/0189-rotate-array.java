class Solution {
    public void rotate(int[] nums, int k) {
        int[] temparr1= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temparr1[(i+k)%nums.length]=nums[i];
        }
       for(int j=0;j<temparr1.length;j++){
           nums[j]=temparr1[j];
       }
    }
}