// let message='good morning folks';

// //returns ascii value of the character at the specified index
// console.log(message.charCodeAt(3));

// //returns the character int he specified index
// console.log(message.charAt(2));

// //reversing a string
// let splittedMessage = message.split('').reverse().join('');
// console.log(splittedMessage);

// //check the string for a particular value present in that
// console.log(message.includes('good'));//returns boolean

// //convert the string to lower case and upper case as need
// console.log(message.toLowerCase());
// console.log(message.toUpperCase());

// console.log(message.substr(0, 10));

// //to find the length of the string
// console.log(message.length);

// function add(...nums){
//     let sum=0;
//     for(let num of nums){
//         sum=sum+num;

//     }
//     console.log('sum of the number is ', sum);
// }
// add(12, 23, 45, 67);

// //object destructuring
// let student = {
//     id: 1234,
//     name: 'vivek',
//     age: 23
    
// };

// let {id, name, ...theRest}=student;

// console.log(name);
// console.log(id);
// console.log(theRest);

//array destructuring
let marks=[20, 40, 80, 90];

let [maths, science, socialscience, ...rest]=marks;

console.log('maths marks ',maths);
console.log('science marks ', science);
console.log('socialScience ', socialscience);
console.log('rest of the marks ', rest);