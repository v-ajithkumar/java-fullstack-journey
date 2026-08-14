import { useEffect, useState } from "react";
import axios from "axios";

function  Employee(){
    const[employess, setEmployee] = useState([]);

    useEffect(()=>{

        async function fetchEmployee() {
        try{
            const response = await  axios.get(
                "http://localhost:8080/emp"
            );
            setEmployee(response.data)
        }
        catch(error){
            console.log(error.message)
        }
    }
     fetchEmployee();

    },[]);
    return(
        <>
            <h3>Employess </h3>
            {employess
                .map(emp => (
                    <p key={emp.id} > {emp.name} </p>
                )
                )}
        </>
    );
}

export default Employee;