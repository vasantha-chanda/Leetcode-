/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const map= new Map();
    const arr= [];
    for(let i=0;i<nums.length;i++){
      if(map.has(nums[i])){
          arr.push(map.get(nums[i]));
          arr.push(i);
      }
        else{
            map.set(target-nums[i],i);
        }
    }
    return arr;
};