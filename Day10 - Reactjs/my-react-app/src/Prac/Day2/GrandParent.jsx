import { useState } from "react";
import Parent from "./Parent";
import Child from "./Child";

function GrandParent(){
    const [message, setMessage] = useState("Welocme");
    
    return(
        <>
            <Parent message={message} />
            <Child changeMessage={setMessage} />
        </>
    );
}

export default GrandParent