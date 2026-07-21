function Event(){
    function sayHello(){
        alert("Hello")
    }
    return (
        <button onClick={sayHello}>Hello Button</button>
    );
}

export default Event;