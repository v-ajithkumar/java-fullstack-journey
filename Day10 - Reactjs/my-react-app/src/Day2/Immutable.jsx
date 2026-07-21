import { useState } from "react";

function Immutable(){
    const [cars , setCars] = useState([
        "bmw",
        "Audi",
        "Benz"
    ])


    function addCar(){
        setCars([
            ...cars,
            "Tesla"
        ])
    }

    function removeCar(){
        setCars(
            cars.filter(car => car != "Audi")
        )
    }

    return(
        <> 
            {
                cars.map(car => 
                    <p key={car}>
                        {car}
                    </p>
                )
            }

            <button onClick={addCar}>Add tesla</button>

            <button onClick={removeCar}>remove audi</button>
            
        </>
    );
}

export default Immutable;