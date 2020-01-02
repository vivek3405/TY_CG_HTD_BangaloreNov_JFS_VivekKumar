"use strict";
var Training = /** @class */ (function () {
    function Training() {
        this.name = 'abc';
        this.age = 21;
        this.USN = 'as123';
        this.marks = 100;
    }
    Training.prototype.printData = function () {
        console.log('hi');
    };
    return Training;
}());
var trainee1 = {
    name: 'raja',
    age: 45,
    printData: function () {
        console.log(this.name, this.age);
    },
    USN: 'ABC',
    marks: 23,
    aadharNo: 1234544,
};
