import { useState } from "react";

function Update(){
    const [fruit, setFruit] = useState([
        "Apple",
        "Orange"
    ])
    function addFruit(){
        setFruit([
            ...fruit,
            "Banana"
        ])
    }
    return(
        <>
            <h3>Fruits</h3>
            {
                fruit.map(fruit => (
                    <p key={fruit}>
                        {fruit}
                    </p>
                ))
            }

            <button onClick={addFruit}>Add banana</button>
        </>
    );
}

export default Update;