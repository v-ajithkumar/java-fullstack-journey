function Login(){
    const isLoggedIn = false;
    if(isLoggedIn){
        return <h1>Welcome</h1>
    }
    return(
        <>
            <h3>Please Login</h3>
        </>
    );
}
export default Login