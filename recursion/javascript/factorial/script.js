function factorial(n) {
    if (n === 0) {
        return 1;
    }

    return n * factorial(n - 1);
}

function factorialWithTailRecursion(n) {
    return factorialTailRecursion(n, 1);
}

function factorialTailRecursion(n, accumulator) {
    if (n === 0) {
        return accumulator;
    }
    return factorialTailRecursion(n - 1, n * accumulator);
}

console.log(factorial(0));
console.log(factorial(3));
console.log(factorial(4));
console.log(factorialWithTailRecursion(0));
console.log(factorialWithTailRecursion(4));
console.log(factorialWithTailRecursion(5));