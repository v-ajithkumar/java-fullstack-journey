const person = {
    name : "John",
    age : 10,
    city : "California",
    // greet : function(){
    //     console.log("hello");
    // }

    greet(){
        console.log("Hello " +this.name);
    }
}

person.greet()
const{name , age ,city } = person
console.log(name);
console.log(age);
console.log(city);



// person.course = "js";
// person.age = 20;
// delete person.course;
// console.log(person);
// console.log(person.name);
// console.log(person.age);
// console.log(person.city);

// const nameOfCity = "city"
// console.log(person[nameOfCity]);

// =======================================================================
