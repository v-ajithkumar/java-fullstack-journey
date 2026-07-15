// let arr = [1,2,3,4,5]
// // console.log(arr[0]);
// console.log(arr.pop());
// console.log(arr);
// arr.push(5)
// console.log(arr);
// arr.unshift(0)
// console.log(arr);
// arr.shift()
// console.log(arr);

// let arr2 = [0,"name",function add(a,b) {return a+b},undefined,null,{ name : "ajith"}]

// console.log(arr2);
// // =========================================================================

const number = [1,2,3]
const doubled = number.map(num => num*2)
console.log(doubled);

const students = [
    { name: "Ajith", marks: 95 },
    { name: "John", marks: 60 },
    { name: "David", marks: 80 },
    { name: "Sam", marks: 40 }
];

students.forEach(student => { console.log(student.name); })

const result = students.filter(student => student.marks>70)
console.log(result);

const student = students.find(student => student.name === "David")
console.log(student);

const passed = students.some(student => student.marks >=90)
console.log(passed);

const minPass = students.every(student => student.marks >= 35)
console.log(minPass);

const sum = students.reduce((total,num) => total+num.marks, 0)
console.log(sum);

const sort = students.sort((a,b) => a.marks - b.marks)
console.log(sort);
