function extractDateData(date) {
    const dateParts = date.split("/");

    const day = Number(dateParts[0]);
    const month = Number(dateParts[1]);
    const year = Number(dateParts[2]);

    return { day, month, year };
}

function extractDateDataAlternative(date) {
    const day = Number(date.substring(0, 2));
    const month = Number(date.substring(3,5));
    const year = Number(date.substring(6,10));

    return {
        day: day,
        month: month,
        year: year
    };
}

const extratedDate = extractDateData("01/07/2010");
console.log(`Dia: ${extratedDate.day}`);
console.log(`Mês: ${extratedDate.month}`);
console.log(`Ano: ${extratedDate.year}`);

console.log("----");

const extratedDateAlt = extractDateDataAlternative("05/12/2022");
console.log(`Dia: ${extratedDateAlt.day}`);
console.log(`Mês: ${extratedDateAlt.month}`);
console.log(`Ano: ${extratedDateAlt.year}`);