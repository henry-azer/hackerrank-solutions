/**
 *   Return the second largest number in the array.
 *   @param {Number[]} nums - An array of numbers.
 *   @return {Number} The second largest number in the array.
 **/
function getSecondLargest(nums) {
    // Complete the function
    let first = nums[0],
        second = -1;
    for (const num of nums) {
        if (num > first) {
            second = first;
            first = num;
        }
        if (num < first && num > second) second = num;
    }

    return second;
}

function main() {
    const n = +readLine();
    const nums = readLine().split(" ").map(Number);

    console.log(getSecondLargest(nums));
}
