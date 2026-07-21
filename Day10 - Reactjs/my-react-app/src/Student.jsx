function Student({name,address,age = 18}) {

    return (
        <>
            <h3> {name} </h3>
            <h3> {age} </h3>
            <h3> {address.city} </h3>
        </>
    );

}

export default Student;