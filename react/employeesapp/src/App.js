import React, { useState } from "react";
import ThemeContext from "./ThemeContext";
import EmployeesList from "./components/EmployeeList";
import "./App.css";


function App() {
  const [theme, setTheme] = useState("light");

  const employees = [
    { id: 1, name: "John", designation: "Developer" },
    { id: 2, name: "David", designation: "Tester" },
    { id: 3, name: "Peter", designation: "Manager" }
  ];

  const changeTheme = () => {
    setTheme(theme === "light" ? "dark" : "light");
  };

  return (
    <ThemeContext.Provider value={theme}>
      <div className={theme}>
        <button onClick={changeTheme}>
          Switch to {theme === "light" ? "Dark" : "Light"} Theme
        </button>

        <h1>Employees</h1>
        <EmployeesList employees={employees} />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;