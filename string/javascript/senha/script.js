//Solution without regex
function validatePassword(str) {
    if (str.length < 8) {
        return false;
    }
    if (!hasLetter(str)) {
        return false;
    }
    if (!hasDigit(str)) {
        return false;
    }
    if (!hasSpecialChar(str)) {
        return false;
    }
    return true;
}

function hasLetter(str) {
    for (let i = 0; i < str.length; i++) {
        if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z')) {
            return true;
        }
    }
    return false;
}

function hasDigit(str) {
    for (let i = 0; i < str.length; i++) {
        if (str[i] >= '0' && str[i] <= '9') {
            return true;
        }
    }
    return false;
}

function hasSpecialChar(str) {
    for (let i = 0; i < str.length; i++) {
        if (str[i] === '@' || str[i] === '#' || str[i] === '&') {
            return true;
        }
    }
    return false;
}
//End solution without regex

//Solutuon with regex
function validatePasswordRegex(password) {
    const regex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[@#&]).{8,}$/;
    return regex.test(password);
}
//End solution with regex

//Solution with regex clean
function validatePasswordRegexClean(str) {
    const hasMinLength = /.{8,}/;
    const hasLetter = /[a-zA-Z]/;
    const hasDigit = /\d/;
    const hasSpecialChar = /[@$#]/;
    return hasMinLength.test(str) && hasLetter.test(str) && hasDigit.test(str) && hasSpecialChar.test(str);
}

console.log(validatePassword("amerca1@"));
console.log(validatePassword("amrca154682"));
console.log(validatePasswordRegexClean("amerca1@"));
console.log(validatePasswordRegexClean("amrca154682"));
console.log(validatePasswordRegex("amerca1@"));
console.log(validatePasswordRegex("amrca154682"));