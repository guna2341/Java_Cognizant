import React, { useState } from "react";
import CurrencyConvertor from "./components/CurrencyConvertor";

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("Hello!! This is a static message.");
  };

  const handleIncrement = () => {
    increment();
    sayHello();
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = (event) => {
    alert("I was clicked");
    console.log(event);
  };

  return (
    <div style={{ padding: "20px" }}>
      <h3>{count}</h3>

      <button onClick={handleIncrement}>Increment</button>
      <br /><br />

      <button onClick={decrement}>Decrement</button>
      <br /><br />

      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>
      <br /><br />

      <button onClick={handleClick}>Click on me</button>

      <br /><br />

      <CurrencyConvertor />
    </div>
  );
}

export default App;