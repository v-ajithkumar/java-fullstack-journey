import { useContext } from "react";
import { useNavigate } from "react-router-dom";
import { AuthContext } from "./AuthContext";

function Home() {

    const navigate = useNavigate();
    const user = useContext(AuthContext);

    function goToAbout() {
        navigate("/about");
    }

    return (
        <>
            <h2>Welcome {user.userName} </h2>
            <button onClick={goToAbout}>
                About
            </button>
        </>
    );
}

export default Home;