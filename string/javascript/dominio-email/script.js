function extractEmailInformation(email) {
    const parts = email.split('@');
    const username = parts[0];
    const domain = parts[1];

    const isBrazilian = domain.endsWith(".br");
    
    return { username, domain, isBrazilian };
}

//Example 1:
const emailinfo1 = extractEmailInformation("joao.silva23@yahoo.com.br")

console.log("Usuario: " + emailinfo1.username);
console.log("Dominio: " + emailinfo1.domain);
console.log("Brasileiro: " + (emailinfo1.isBrazilian ? "sim" : "nao"));

console.log("-----------------------");

//Example 2:
const emailinfo2 = extractEmailInformation("maria123@gmail.com")

console.log("Usuario: " + emailinfo2.username);
console.log("Dominio: " + emailinfo2.domain);
console.log("Brasileiro: " + (emailinfo2.isBrazilian ? "sim" : "nao"));