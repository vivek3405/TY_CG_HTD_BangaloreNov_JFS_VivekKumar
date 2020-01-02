interface Trainee extends Student1{
    name: String,
    age: number,
    printData(): void
}
class Training implements Trainee{
    name= 'abc';
    age= 21;
    USN='as123';
    marks=100
    printData(){
        console.log('hi');
    }
}

let trainee1: Trainee={
    name:'raja',
    age:45,
    printData: function(){
        console.log(this.name, this.age);
    },
    USN: 'ABC',
    marks: 23,
    aadharNo:1234544,
}