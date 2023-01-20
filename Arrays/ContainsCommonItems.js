// function ContainsCommonItem(arr1, arr2) {
//     for (let i = 0; i < arr1.length; i++) {
//         for (let j = 0; j < arr2.length; j++) {
//             if (arr1[i]==arr2[j]) {
//                 return true;
//             }
//         }
//     }
//     return false;
// }

// result = ContainsCommonItem(['a','b','c','x'],['z','y','i'])
// console.log(result);

// // O(a*b)

function ContainsCommonItem(arr1, arr2){
    let map = {}; 
    for (let index = 0; index < arr1.length; index++) {
        if (!map[arr1[index]]) {
            const item = arr1[index];
            map[item] = true;
        }
    }  

    for (let index = 0; index < arr2.length; index++) {
        if (map[arr2[index]]) {
            return true;
        }
    }

    return false;
}

result = ContainsCommonItem(['a','b','c','x'],['z','y','x'])
console.log(result);

// O(a+b)