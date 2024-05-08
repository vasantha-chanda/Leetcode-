/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const stack = [];
    const openingBrackets = ['(', '[', '{'];
  const closingBrackets = [')', ']', '}'];
    for(let i of s){
        if(openingBrackets.includes(i)){
         stack.push(i)   
        }
        else if(closingBrackets.includes(i)){
                const topelement=stack.pop();
                if(openingBrackets.indexOf(topelement)!=closingBrackets.indexOf(i)){
                    return false;
                }
                
            }
        
    }
    return stack.length>0?false:true
};