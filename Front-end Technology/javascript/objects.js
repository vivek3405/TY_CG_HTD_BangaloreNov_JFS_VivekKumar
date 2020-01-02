var person={
    aadharNo: 9876543212344
}
var personPan={
    pan: 'QWER3435'
}
var student ={
    ...personPan,
    ...person,
    id: 1234,
    name: 'vivek',
    degree: 'btech',
    phone: 9876543219,
    address: {
        city: 'bangalore',
        state: 'karnataka'
    }
}
console.log(student.name);
console.log(student['degree']);
console.log(student);


