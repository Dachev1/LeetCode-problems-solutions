/**
* @param {number[]} nums
* @param {number} n
* @param {number} left
* @param {number} right
* @return {number}
*/
var rangeSum = function (nums, n, left, right) {
    const subArraySums = [];

    for (let i = 0; i < n; i++) {
        let currentSum = 0;
        for (let j = i; j < n; j++) {
            currentSum += nums[j];
            subArraySums.push(currentSum);
        }
    }

    const sortedArr = subArraySums.sort((a, b) => a - b);
    let result = 0;

    for (let i = left - 1; i < right; i++) {
        result += sortedArr[i];
    }

    let modulo = 1e9 + 7;
    return result % modulo;
};


rangeSum([9, 3, 2, 2, 6, 9, 6, 6], 8, 4, 8)
