import React, { useState } from "react";

function Register() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const handleName = (e) => {
    setName(e.target.value);
  };

  const handleEmail = (e) => {
    setEmail(e.target.value);
  };

  const handlePassword = (e) => {
    setPassword(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (name.length < 5) {
      alert("Name must be at least 5 characters long");
      return;
    }

    if (!(email.includes("@") && email.includes("."))) {
      alert("Email is not valid");
      return;
    }

    if (password.length < 8) {
      alert("Password must be at least 8 characters long");
      return;
    }

    alert("Registration Successful");
  };

  return (
    <div style={{ marginTop: "80px", marginLeft: "250px" }}>
      <h1 style={{ color: "red" }}>Register Here!!!</h1>

      <form onSubmit={handleSubmit}>
        <table>
          <tbody>
            <tr>
              <td>Name:</td>
              <td>
                <input
                  type="text"
                  value={name}
                  onChange={handleName}
                />
              </td>
            </tr>

            <tr>
              <td>Email:</td>
              <td>
                <input
                  type="text"
                  value={email}
                  onChange={handleEmail}
                />
              </td>
            </tr>

            <tr>
              <td>Password:</td>
              <td>
                <input
                  type="password"
                  value={password}
                  onChange={handlePassword}
                />
              </td>
            </tr>

            <tr>
              <td></td>
              <td>
                <button type="submit">Submit</button>
              </td>
            </tr>
          </tbody>
        </table>
      </form>
    </div>
  );
}

export default Register;