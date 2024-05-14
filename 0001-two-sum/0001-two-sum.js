/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const map=new Map();
  for(var i=0;i<nums.length;i++){
      if(!map.has(nums[i]))
     { map.set(target-nums[i],i)}
      else{
          return [i,map.get(nums[i])]
      }
  }
};