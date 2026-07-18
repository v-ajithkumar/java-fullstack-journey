console.log("start");
try{
    JSON.parse("Hello")
}
catch(error){
    console.log(error.name);
    console.log(error.message);
}
console.log("end");


let age = -10;
try{
    if(age < 0){
        throw new Error("Age is negative")
    }
}
catch(error){
    console.log(error.message);   
}