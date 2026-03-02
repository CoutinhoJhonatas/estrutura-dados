function mergeLists(list1, list2) {
    if (list1.length === 0) {
        return list2;
    }
    if (list2.length === 0) {
        return list1;
    }

    const head1 = list1[0];
    const tail1 = list1.slice(1);

    const head2 = list2[0];
    const tail2 = list2.slice(1);

    const result = [];
    result.push(head1);
    result.push(head2);

    return result.concat(mergeLists(tail1, tail2));
}

console.log(mergeLists([10, 20, 30], [5, 8, 7])); // [10, 5, 20, 8, 30, 7]
console.log(mergeLists(["ana", "maria"], ["joao", "bob", "alex", "leo"])); // ["ana", "joao", "maria", "bob", "alex", "leo"]