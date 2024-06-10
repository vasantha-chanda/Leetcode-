/**
 * @param {number[]} heights
 * @return {number}
 */
var heightChecker = function(heights) {
    const sortedarr=[...heights]
    sortedarr.sort((a,b)=>a-b);
    
    let count=0;
    console.log(sortedarr);
    for(var i=0;i<heights.length;i++){
        if(heights[i] !== sortedarr[i]){
            count++;
        }
    }
    return count;
};