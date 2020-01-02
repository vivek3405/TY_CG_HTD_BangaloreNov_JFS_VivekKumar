console.log("welcome");

// var a;
// a=100;

// console.log(a);
// console.log(typeof a); //using typeof we can show the datatype of the variable

// var name = "vivek";
// console.log(name);
// console.log(typeof name);

// var age=23;

// var details=`The name is ${name} and the age is ${age}`;
// console.log(details);

// console.log(`the sum of 10 and 11 is ${10+11}`);

// var sampleText= `Lorem ipsum dolor sit amet consectetur adipisicing elit. Expedita illum aperiam accusantium provident labore
// corporis fugit veritatis atque nihil nemo, consequatur repudiandae, praesentium ab eius omnis adipisci! Ex, non
// commodi magnam ea est earum natus optio facere aut alias ipsam quibusdam ratione explicabo tempore eum, ut mollitia
// at eligendi labore sequi deleniti quos sit! Placeat voluptates fuga quod harum expedita illum laborum officiis sed
// fugiat maiores voluptatibus repellendus id numquam voluptas voluptatem culpa, earum voluptatum iste in. Doloribus
// iusto quaerat quam pariatur exercitationem, incidunt dignissimos distinctio est. Illo enim in reiciendis
// perferendis, ipsa dignissimos eaque minima sit labore? Quis, sit`;

// console.log(sampleText);

// if(null==undefined){
//     console.log("true block");
// }else{
//     console.log("false block");
// }

var userConfirmation=confirm('are you sure you want to proceed?');

if(userConfirmation){
    console.log("user selected ok");

}else{
    console.log('user denied');
}

var userInput=prompt('please enter your name');

console.log(userInput);

document.write("welcome  to javascript");
// var a='xyz';s
// function demo(){
//     console.log(a);
//     var b='abc';//we cannot use it outside the block because it is local varianle
//     console.log("fuction demo is called")
// }
// demo();

var test = function(){
    console.log('anonymous funtion assigned');
}
test();

(function demo1(){
    var myName='vivek';
    console.log(myName);
    console.log("IIFE running");
})();
//` console.log('outside the funtion',myName);

function sample(x){
    console.log('sample function started');
    x();
    console.log('sample function is ended')
}

sample(function(){
    console.log('callback function running')
});