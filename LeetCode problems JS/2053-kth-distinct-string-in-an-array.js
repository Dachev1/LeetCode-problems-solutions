/**
 * @param {string[]} arr
 * @param {number} k
 * @return {string}
 */
var kthDistinct = function (arr, k) {
    const strCount = {};

    for (const el of arr) {
        if (!strCount.hasOwnProperty(el)) {
            strCount[el] = 0;
        }

        strCount[el]++;
    }

    const singleStrAppearance = Object.keys(strCount)
        .filter(str => Number(strCount[str]) === 1);

    k--;
    if (singleStrAppearance.length < k || singleStrAppearance.length === 0) {
        return '';
    } else {
        return singleStrAppearance[k]
    }
};
