import { useState } from "react";

function ControlledComp(){
    const [name, setName] = useState("")

    return(
        <>
        <input type="text" value={name} onChange={(e) => setName(e.target.value)} />
        <h3>Hello {name} </h3>
        </>
    );
}
export default ControlledComp