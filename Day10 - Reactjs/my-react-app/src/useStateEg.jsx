import { useState } from "react";

function UseStateEg(){
    const [count , setCount] = useState(0);
    function increase(){
        setCount(previous => previous+1)
    }
    return (
        <>
            <h1>count : {count} </h1>
            <button onClick={increase}> Increase </button>
        </>
    );
}

export default UseStateEg