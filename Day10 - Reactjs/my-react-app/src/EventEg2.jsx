import { useState } from "react";

function OnchangeEvent(){
    const [name, setName] = useState("");
    function changeName(event){
        setName(event.target.value)
    }
    return(
        <>
        <input type="text" onChange={changeName}/>
        <h3> {name} </h3>
        
        </>
    );

}

export default OnchangeEvent