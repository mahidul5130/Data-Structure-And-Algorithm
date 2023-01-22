const array =['a', 'b', 'c', 'd', 'e']
// 4 * 4 = 16 bytes of storage

// Access / Lookp an item of an Array
console.log();
console.log();
console.log("Accessed Item: "+array[2]);
// O(1)


// Push an element in an array
console.log();
console.log();
console.log("Array Before Pushing: " + array);
array.push('f');
console.log("Array After Pushing: " + array);
// O(1)


// Pop an element in an array
console.log();
console.log();
console.log("Array Before Poping: " + array);
array.pop();
console.log("Array After Poping: " + array);
// O(1)


// Insert an element in the begining an array
console.log();
console.log();
console.log("Array Before Insertion: " + array);
array.unshift("x");
console.log("Array After Insertion: " + array);
// O(n)


// Insert an element at an index of an array
console.log();
console.log();
console.log("Array Before Insertion: " + array);
array.splice(2, 0, "alien")
console.log("Array After Insertion: " + array);
// O(n)