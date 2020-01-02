"use strict";
var Student1 = /** @class */ (function () {
    function Student1(name, age, USN, marks, aadharNo) {
        this.name = name;
        this.age = age;
        this.USN = USN;
        this.marks = marks;
        this.aadharNo = aadharNo;
    }
    return Student1;
}());
var stud = {
    name: 'vivek',
    age: 23,
    USN: 'qwee123',
    marks: 15
};
var student2 = new Student1('saif', 30, 'abc345', 12, undefined);
var clearedStudents = [
    new Student1('Abhi', 22, 'abc34', 70),
    new Student1('vivek', 23, 'viv234', 56)
];
console.log(clearedStudents);
