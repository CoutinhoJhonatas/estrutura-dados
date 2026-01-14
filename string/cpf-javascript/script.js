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