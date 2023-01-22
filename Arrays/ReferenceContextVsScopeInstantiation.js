// The main difference between the == and === operator in javascript is that the == operator does the type conversion of the operands before comparison, whereas the === operator compares the values as well as the data types of the operands.

var object1 = {value: 10};
var object2 = object1;
var object3 = {value: 10};

console.log(object1 === object2);
console.log(object1 == object2);
console.log(object1 === object3);