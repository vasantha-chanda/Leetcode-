import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums == null || nums.length == 0) return 0;
        Set<Integer> set= new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int ans=1;
        for(int k:set){
            
            int currentNum=k;
            int count=1;
            if(!set.contains(currentNum-1)){
                
                 while(set.contains(currentNum+1)){
                count++;
                currentNum++;
            }
            }
           
            ans=Math.max(ans,count);
            
        }
        return ans;
    }
}
