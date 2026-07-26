// const student = {
//         name : "John",
//         greet() {
//             console.log(this.name);
//         }
//     }
//     student.greet();

var name = "Global";

const student2 = {
    name : "Mark",

    show: function () {

        const call = () => {
            const greet = () => {
                console.log(this.name);
            };
            greet();
        };

        call();
    }
};

student2.show();