import { useEffect, useState } from "react";
import axios from "axios";

function GetEmployee(){
    const [emp, setEmp] = useState("");

    useEffect(()=>{
        async function fetchEmployee() {
            try{
                const response = await axios.get("http://localhost:8080/emp/getEmp")
                setEmp(response.data)
            }catch(error){
                console.log(error.message);
            }
        }
        fetchEmployee();
    },[]);
    return(
        <>
            <h3>Employess are</h3>
            <h3 style={{color : "red", border :" 2px solid red"}}> {emp} </h3>
        </>
    );
}

export default GetEmployee