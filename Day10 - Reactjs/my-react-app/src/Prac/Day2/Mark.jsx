function Mark(){
    const mark = 90
    return(
        <>
        {
            mark >= 35 ? <h2>pass</h2> : <h2>fail</h2>
        }
        </>
    );
}
export default Mark