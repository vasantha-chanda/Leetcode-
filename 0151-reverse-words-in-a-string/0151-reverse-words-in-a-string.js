/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    return arrString = s.split(" ").filter(word => word !== "").reverse().join(" ");
};