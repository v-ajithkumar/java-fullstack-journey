import { useState } from "react";

function OnSubmitEg(){
    const [userName , setUserName] = useState("");
    function HandleSubmit(event){
        event.preventDefault()
        console.log(userName);
    }
    return (
        <form onSubmit={HandleSubmit}>
            <input type="text" value={userName} onChange={(event) => setUserName(event.target.value)}/>
            <button type="submit">Login</button>
        </form>
    );
}
export default OnSubmitEg;