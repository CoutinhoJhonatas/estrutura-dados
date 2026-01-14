function removeNonDigits(str) {
    const regex = /\D/g;
    return str.replace(regex, "")
}

//Example 1:
console.log(removeNonDigits("87409217293"))
//Example 2:
console.log(removeNonDigits("874092172-93"))
//Example 3:
console.log(removeNonDigits("874.092.172-93"))

//------------------------------

function removeNonDigitsAlternative(str) {
    let array = [];
    for (let i = 0; i < str.length; i++) {
        if (str[i] >= '0' && str[i] <= '9') {
            array.push(str[i]);
        }
    }

    return array.join("");
}

console.log("Using alternative method:")

//Example 1 alternative:
console.log(removeNonDigitsAlternative("87409217293"))
//Example 2 alternative:
console.log(removeNonDigitsAlternative("874092172-93"))
//Example 3 alternative:
console.log(removeNonDigitsAlternative("874.092.172-93"))