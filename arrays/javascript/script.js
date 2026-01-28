function findMaxConsecutiveOnes(nums) {
    let count = 0;
    let maxConsecutiveOnes = 0;
    for (const n of nums) {
        if (n === 1) {
            count++;
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);
        } else {
            count = 0;
        }  
    }

    return maxConsecutiveOnes;
}

console.log(findMaxConsecutiveOnes([1, 1, 0, 1, 1, 1]));
console.log(findMaxConsecutiveOnes([1, 0, 1, 1, 0, 1]));