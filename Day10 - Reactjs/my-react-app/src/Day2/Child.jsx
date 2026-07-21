function Child( {changeMessage} ){
    return(
        <>
            <button onClick={() => changeMessage ("Hello")}>Change message</button>
        </>
    );
}

export default Child;