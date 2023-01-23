function reverse(str) {

    // Check Input
    if(!str || str.length < 2 || typeof str !== "string"){
        return "hmm, that's not good."
    }

    // Reverse array initialize
    const backwards = [];
    const lastIndex = str.length - 1;

    // reverse processing
    for (let index = lastIndex; index >= 0; index--) {
        backwards.push(str[index]);
    }

    // return reverse array
    return backwards.join('');
}

result = reverse("abcdef")

console.log(result);

// Increase Readabilty
function reverse2(str) {
    return str.split('').reverse().join('');
}

result = reverse2(result);
console.log(result);


// Increase Readabilty
const reverse3 = str=>str.split('').reverse().join('');
result = reverse3(result);
console.log(result);

// Increase Readabilty
const reverse4 = str=>[...str].reverse().join('');
result = reverse3(result);
console.log(result);