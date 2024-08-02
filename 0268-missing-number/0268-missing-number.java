class Solution {
    public int missingNumber(int[] nums) {
       Set set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int k=0;
        while(k<=nums.length){
            if(!set.contains(k)){
                return k;
            }
            k++;
        }
        return 0;
    }
}