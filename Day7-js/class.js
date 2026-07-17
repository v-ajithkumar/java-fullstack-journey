class Student{
    constructor(name, age){
        this.name = name;
        this.age = age
    }

    introduce(){
        console.log("Hello " + this.name);
    }

    showAge() {
        console.log(this.age);
    }
}

// const s1 = new Student("John",22);
// // console.log(s1);
// s1.introduce();
// s1.showAge();

class Person {
    constructor(name) {
        this.name = name;
    }
    greet() {
        console.log("Hello " + this.name);
    }
}

class Student2 extends Person {
    constructor(name,age){
        super(name);
        this.age=age;
    }
}

const s2 = new Student2("Ajith",22);
console.log(s2);


