import { useEffect, useState } from "react";

function UseEffectEg( {id} ){
    const [count, setCount] = useState(0);

    useEffect(()=>{
        console.log("Employee loaded " , id);
    },[id])
    return(
        <>
            <h2> {count} </h2>
            <button onClick={() => setCount(count+1)}>
                 Click to add 1 Count
            </button>
        </>
    );
}

export default UseEffectEg