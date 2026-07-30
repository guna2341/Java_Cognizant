import React, { useContext } from "react";
import "../App.css";
import ThemeContext from "../ThemeContext";

function EmployeeCard({ employee }) {
  const theme = useContext(ThemeContext);
  

  return (
    <div>
      <h3>{employee.name}</h3>
      <p>{employee.designation}</p>

      <button className={theme}>View</button>
      <button className={theme}>Edit</button>
    </div>
  );
}

export default EmployeeCard;