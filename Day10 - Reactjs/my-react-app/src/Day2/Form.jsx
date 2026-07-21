import { useState } from "react";

function Form(){
    const [name, setName] = useState("");
    const [age, setAge] = useState();
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [accepetd, setAccepted] = useState(false);
    const [country, setCountry] = useState("");

    function handleSubmit(event){
        event.preventDefault();
        if (name.trim() === "") {
            alert("Name is required");
            return;
        }

        if (!email.includes("@")) {
            alert("Enter a valid email");
            return;
        }
        alert("Registration Successful");

        setName("");
        setEmail("");
        setPassword("");
        setAccepted(false);
    }
    return(
        <>  <form onSubmit={handleSubmit}>
            <label htmlFor="name">Name :</label>
            <input type="text" id="name" onChange={(e) => setName(e.target.value)} />
            <h3>Name : {name} </h3>

            <label htmlFor="age">Age :</label>
            <input type="number" id="age" onChange={(e) => setAge(e.target.value)} />
            <h3>Age : {age} </h3>

            <label htmlFor="email">Email : :</label>
            <input type="email" id="email" onChange={(e) => setEmail(e.target.value)} />
            <h3>Email : {email} </h3>

            <label htmlFor="pass">Pass :</label>
            <input type="password" id="pass" onChange={(e) => setPassword(e.target.value)} />
            <h3>Pass : {password} </h3>

            <label htmlFor="accept">Accpet :</label>
            <input type="checkbox" id="accept" onChange={(e) => setAccepted(e.target.checked)} />
            <h3> {accepetd ? "accepted" : "not accepted"} </h3>

            <label htmlFor="country">Country :</label>
            <select name="" id="country" onChange={(e) => setCountry(e.target.value)}>
                <option value="">Select</option>
                <option value="India">India</option>
                <option value="Usa">Usa</option>
            </select>
            <h3>Country : {country} </h3>

            <button>Submit</button>
            </form>
        </>
    );
}

export default Form;