// var technology=['java', 'spring','jdbc'];

// console.log(technology[0]);

// for (let iterator of technology) {
//     console.log(iterator);

// }
// for (let key in technology) {
//     console.log(technology[key]);
// }

// console.log("index of spring is "+ technology.indexOf('angular'));

// console.log('before pop '+ technology);

// console.log(technology.pop());
// console.log('after pop', technology);

// console.log('before adding ', technology);
// technology.push('spring boot');
// console.log('after pushing '+technology);

// console.log(technology.shift());

// console.log('after shift', technology);

// technology.splice(1,0, 'bootstrap', 'javascript');

// console.log(technology);

// technology.splice(technology.indexOf('bootstrap'),1);

// console.log(technology.length);

// console.log('reversed array '+ technology);


// let marks = [12, 30, 45, 60, 70, 90, 10, 23];

// let filteredArray = marks.filter((value, index, array) => {
//     return value > 40;
// });

// console.log(filteredArray.length);

// var mark = [20, 20, 20, 30, 40, 40, 50, 60, 70, 70];

// let filteredArr = mark.filter((value, index, array) => {

//     return (mark.indexOf(value) === index);
// })
// console.log(filteredArr);

var x=[20,30,40,50,60];

let myArray = marks.map((value, index, array)=>{
    return { ind: index, val: value };
});

console.log(myArray);