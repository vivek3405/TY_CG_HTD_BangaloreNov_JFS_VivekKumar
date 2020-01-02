"use strict";
console.log("typescript code started");
var a = 100; //implicitly considered as let a: number=100
//a='string'; error.. connot reasign type number to string
a = null; //after we make strictnullchecks is false.. the it will no throw any error whenever we assign a implicit variable to null
var b; //implicitly it will considered as any;
b = 100;
b = 'vivek';
console.log(b);
var arrayOfStrings;
arrayOfStrings = ["abc", "def", "ghi"];
//let marks: number[] = [1, 3, 4, 5, 'abc']//array assigning particular type of value;
var student;
student = {
    name: "vivek",
    age: 35,
    pass: true
};
var Sample = /** @class */ (function () {
    function Sample() {
        this.a = 100;
        this.b = 'abc';
    }
    return Sample;
}());
var sample = new Sample();
console.log(sample.a);
console.log(sample.b);
var Student = /** @class */ (function () {
    function Student(name, age, USN, marks) {
        this.name = name;
        this.age = age;
        this.USN = USN;
        this.marks = marks;
    }
    Student.prototype.printDetails = function () {
        console.log("\n        name  is " + this.name + "\n        age is " + this.age + "\n        USN is " + this.USN + "\n        Marks is " + this.marks);
    };
    return Student;
}());
var student1 = new Student('vivek', 23, 'qwwerty12', 89);
console.log(student1.USN);
student1.printDetails();
console.log("typerscript code ended");
