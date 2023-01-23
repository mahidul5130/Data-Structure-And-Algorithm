// reference type
// The main difference between the == and === operator in javascript is that the == operator does the type conversion of the operands before comparison, whereas the === operator compares the values as well as the data types of the operands.

var object1 = {value: 10};
var object2 = object1;
var object3 = {value: 10};

console.log(object1 === object2);
console.log(object1 == object2);
console.log(object1 === object3);

// context vs scope
const object4 = {
    a : function(){
        console.log(this);
    } 
}

console.log(object4.a());


class Player{
    constructor(name, type){
        console.log("Player: " + this);
        this.name = name;
        this.type = type;
    }
    Introduce(){
        console.log("Hey I am " + this.name + ". I am a " + this.type + ".");
    }
}

class Wizard extends Player{
    constructor(name, type){
        super(name, type);
        console.log("Wizard: " + this);
    }
    play(){
        console.log("WEEEEEEEEEEE I'm a " + this.type);
    }
}

const wizard1 = new Wizard("Shelly", "Healer");
const wizard2 = new Wizard("Shelly", "Dark Magic");

wizard1.play();
wizard1.Introduce();
wizard1.play();
wizard2.Introduce();