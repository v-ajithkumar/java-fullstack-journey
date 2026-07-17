let i=1;   
 
// for(i=1 ; i<=5 ; i++){
//     console.log(i);
// }


// while(i<=5){
//     console.log(i);
//     i++
// }

// do{
//     console.log(i);
//     i++;
// }while(i<=5)

const student = {
    name : "John",
    age : 10,
    city : "Mannor"
}

for(let key in student){
    console.log(key, student[key]);
}

const arr = [10,20,20,30]
for(let values of arr){
    console.log(values);
}