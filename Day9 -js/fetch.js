const employee = {
    name : "John",
    age : 30,
    city : "Valentino"
};

fetch("https://example.com/employees",{
    method : "POST",
    headers : {
        "Content-Type" : "application/json",
        "Authorization" : "Bearer your_jwt_token",
        "Accept": "application/json"
    },
    body: JSON.stringify(employee) 
});

// =================================================
//Json methods
const json = '{"name":"Ajith","age":23}';

const employee1 = JSON.parse(json); // parse is used to convert json string to js object

console.log(employee1.name);

// const res = JSON.stringify(employee);  // used to convert js object to json string
// console.log(res)