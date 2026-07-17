//callback func
// function add(a,b){
//     return a+b
// }

// function calculate(x,y,operations){
//     console.log(operations(x,y));
// }

// calculate(10,20,add)

//HOF
// function greet(name){
//     console.log("Hello " + name);
// }

// function processsUser(callbackFunc){
//     callbackFunc("john")
// }

// processsUser(greet)

// function multiply(x) {
//     return function(y) {
//         return x * y
//     }
// }

// const double = multiply(2);
// console.log(double(10));

// Lexical scope
// let city = "Chennai";
// function cityName(){
//     console.log(city);   
// }
// cityName()

// closure
function outer(){
    let count = 0 ;
    
    function inner(){
        count++;
        console.log(count);
    }
    return inner;
}

const count = outer();
count();
count();
count();

// IIFE

(function(name){
    console.log("HEllo " + name);
    
})("John");


//lexical scope
let message = "Hello";

function outer() {
    let name = "Ajith";

    function inner() {
        console.log(message);
        console.log(name);
    }

    inner();
}

outer();