// const person1 = {
//     name : "David",
//     greet() {
//         console.log(this.name);
//     }
// };

// const person2 = {
//     name : "John",
//     age: 20,
//     address: {
//         city : "london",
//         street : "St.John Street"
//     },
//     greet : person1.greet
// };

// person2.greet();

// Destructure 
// const {name: fullName ,age = 10,city } = person2
// console.log(fullName);
// console.log(city);
// console.log(age);

// const {address : {city,street} } = person2
// console.log(city);
// console.log(street);

// const person3 = {
//     name : "Marston",
//     city : "RedHill"
// }

// const copy = {
//     ...person3,
//     street : "Chruch street"
// }

// console.log(copy);


// const name = "John"
// const age = 10

// const person = {
//     name,
//     age
// }

// console.log(person);

// const key = "email";
// const person2 = {
//     [key] : "demo@email.com"
// }
// console.log(person2);

const person = {
    name : "John",
    age : 10,
    city : "Church"
}
// const keys = Object.keys(person)
// console.log(keys);

// const values = Object.values(person)
// console.log(values);

// const entries = Object.entries(person)
// console.log(entries);

// const copy = Object.assign({},person)
// console.log(copy);

const person2 = {
    age : 30
}

const copy2 = Object.assign({},person,person2)
// console.log(copy2);

Object.freeze(person)
person.name = "Ken"
console.log(person);

