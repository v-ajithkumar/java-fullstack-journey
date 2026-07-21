import { useState } from "react";

function UpdateArr(){
    const[student , setStudent] = useState({
        name : "John",
        age : 22,
        city : "Valentine"
    })

    function changeName(){
       setStudent({
         ...student,
        name : "Marston"
       })
    }
    return(
        <>
            <h2> {student.name} </h2>
            <button onClick={changeName}>Change Name</button>
        </>
    );
}
export default UpdateArr