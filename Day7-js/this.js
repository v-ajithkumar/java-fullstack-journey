const student = {
        name : "John",
        greet() {
            console.log(this.name);
        }
    }
    student.greet();

var name = "Global"
    const student2 = {
        name : "mark",
        show : function(){
            function call(){
                const greet= () => {
                console.log(this.name);
            }
            greet();
            }
        }
    }
student2.show()