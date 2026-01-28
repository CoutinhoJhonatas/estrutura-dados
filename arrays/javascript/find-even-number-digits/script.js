const findNumbers = (nums) => {
    let countEvenNumber = 0;
    for (let value of nums) {
        let numDigits = value.toString().length;
        if (numDigits % 2 === 0) 
            countEvenNumber++;
    }
    return countEvenNumber;
};

const findNumberAlternative = (nums) => {
    let countEvenNumber = 0;
    for (let value of nums) {
        let actualNumber = value;
        let countEven = 0;
        while (actualNumber > 0) {
            actualNumber = Math.floor(actualNumber / 10);
            countEven++;
        }

        if (countEven != 0 && countEven % 2 === 0) {
            countEvenNumber++;
        }
    }
    return countEvenNumber;
};

console.log(findNumbers([12,345,2,6,7896])); // 2
console.log(findNumbers([555, 901, 482, 1771])); // 1
console.log(findNumberAlternative([12,345,2,6,7896])); // 2
console.log(findNumberAlternative([555, 901, 482, 1771])); // 1