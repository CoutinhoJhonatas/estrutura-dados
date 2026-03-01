function minor(list) {
    if (list.length === 1) {
        return list[0];
    }

    const head = list[0];
    const tail = list.slice(1);
    const minorTail = minor(tail);

    return head < minorTail ? head : minorTail;
}

console.log(minor([10, 15, 20, 8, 30, 17]));