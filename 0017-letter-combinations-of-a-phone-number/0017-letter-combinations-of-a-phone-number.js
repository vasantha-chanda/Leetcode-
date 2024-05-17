/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function(digits) {
    if (digits.length === 0) {
        return [];
    }
    
    // Define the mapping of digits to letters
    const map = new Map([
        ['2', 'abc'],
        ['3', 'def'],
        ['4', 'ghi'],
        ['5', 'jkl'],
        ['6', 'mno'],
        ['7', 'pqrs'],
        ['8', 'tuv'],
        ['9', 'wxyz']
    ]);
    
    // Initialize the result array with an empty string
    let result = [''];
    
    // Iterate over each digit in the input
    for (let digit of digits) {
        const letters = map.get(digit);
        const tempResult = [];
        // Iterate over each combination in the current result
        for (let combination of result) {
            // Append each letter from the current digit to each combination
            for (let letter of letters) {
                tempResult.push(combination + letter);
            }
        }
        // Update the result array with the new combinations
        result = tempResult;
    }
    
    return result;
};