function isPalindrome(text) {
    return isPalindormeTailRecursive(text, 0, text.length - 1);
}

function isPalindormeTailRecursive(text, leftIndex, rightIndex) {
    if (leftIndex >= rightIndex) {
        return true;
    }

    if (text[leftIndex] !== text[rightIndex]) {
        return false;
    }

    return isPalindormeTailRecursive(text, leftIndex + 1, rightIndex - 1);
}

console.log(isPalindrome(""));
console.log(isPalindrome("aba"));
console.log(isPalindrome("abccba"));
console.log(isPalindrome("abcfba"));