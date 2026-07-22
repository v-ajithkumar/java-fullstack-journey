import { Link, NavLink, Route, Routes } from "react-router-dom";
import "./App.css";
import About from "./Day3/About";
import Home from "./Day3/Home";
import User from "./Day3/User";
import PrivateRoute from "./Day3/ProtectedRoute";

function App() {
  return (
    <>
    <Link to="/home">Home</Link>
    <NavLink to="/about" 
      style={({ isActive }) => ({color: isActive ? "red" : "black"})}>About</NavLink>

    <Routes >
      
      <Route path="/about" element={<About />} />
      <Route path="/home" element={<Home />} />
     <Route element = {<PrivateRoute />}> 
        <Route path="/users/:id" element = {<User />} />
    </Route>
    </Routes>
    </>
  );
}

export default App;