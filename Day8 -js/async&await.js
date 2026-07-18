// async function greet () {
//     return "Hello"
// };
// console.log(greet());

// const value = await greet();
// console.log(value);

async function loadUser() {
    console.log("start");
    
    try{
        const response = await Promise.reject("Server Down");
        console.log(response);
    }
    catch(error){
        console.log(error);
    }
    console.log("end");
    
}
loadUser();