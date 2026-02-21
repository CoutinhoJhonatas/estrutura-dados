function mergeArrays(nums1, m, nums2, n) {
    for (let i = 0; i < n; i++) {
        nums1[m + i] = nums2[i];
    }

    nums1.sort((a, b) => a - b);
}

const array1 = [1, 2, 3, 0, 0, 0];
const array2 = [1];
mergeArrays(array1, 3, [2, 5, 6], 3);
mergeArrays(array2, 1, [], 0);

console.log(array1);
console.log(array2);