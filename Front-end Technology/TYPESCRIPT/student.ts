class Student1{

    constructor(
        public name: String, 
        public age: number,
        public USN: String,
        public marks: number,
        public aadharNo ?: number){

    }
}
let stud: Student1={ // objec using literals
    name: 'vivek',
    age: 23,
    USN: 'qwee123',
    marks: 15
}

let student2=new Student1(
    'saif', 30, 'abc345', 12, undefined
);
let clearedStudents =[
    new Student1('Abhi', 22, 'abc34', 70),
    new Student1('vivek', 23, 'viv234', 56)
];

console.log(clearedStudents);