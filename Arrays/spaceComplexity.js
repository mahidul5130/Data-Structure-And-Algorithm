function boo(array){
    for (let index = 0; index < array.length; index++) {
        console.log("booo");
    }
}

boo([5, 10, 200]) //Space Comlexity --> O(1), Time Comlexity --> O(n)

// #6 Space complexity O(n)
function arrayOfHiNTimes(n) {
    var hiArray = [];
    for (let i = 0; i < n; i++) {
        hiArray[i] = 'hi';
    }
    return hiArray;
}

arrayOfHiNTimes(6) // Space Complexity --> O(n)