console.log("typescript code started");

let a = 100;//implicitly considered as let a: number=100
//a='string'; error.. connot reasign type number to string
a = null;//after we make strictnullchecks is false.. the it will no throw any error whenever we assign a implicit variable to null
let b; //implicitly it will considered as any;

b = 100;
b = 'vivek';

console.log(b);

let arrayOfStrings: String[];
arrayOfStrings = ["abc", "def", "ghi"];

//let marks: number[] = [1, 3, 4, 5, 'abc']//array assigning particular type of value;

let student: {name: String, age: number, pass: boolean};

student={
    name: "vivek",
    age: 35,
    pass: true
}
class Sample{
    a=100;
    b='abc';
}

let sample =new Sample();
console.log(sample.a);
console.log(sample.b);

class Student{

    constructor(public name: String, public age: number,public USN: String, public marks: number){

    }
    printDetails(): void{
        console.log(`
        name  is ${this.name}
        age is ${this.age}
        USN is ${this.USN}
        Marks is ${this.marks}`);
    }

}
let student1=new Student('vivek', 23, 'qwwerty12', 89);
console.log(student1.USN);
student1.printDetails();

console.log("typerscript code ended");