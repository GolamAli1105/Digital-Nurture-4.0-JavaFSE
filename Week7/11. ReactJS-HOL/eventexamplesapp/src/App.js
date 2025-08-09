import React from "react";
import { useState, useRef } from "react";

function App() {
  const [value, setValue] = useState(0);
  const mon = useRef();
  const curr = useRef();
  return (
    <div>
      <div>{value}</div>

      <div
        style={{
          display: "flex",
          flexDirection: "column",
          gap: "10px",
          width: "150px",
        }}
      >
        <button
          onClick={() => {
            setValue(value + 1);
            alert("Hello!Member1");
          }}
        >
          increment
        </button>
        <button
          onClick={() => {
            setValue(value - 1);
          }}
        >
          decrement
        </button>
        <button
          onClick={() => {
            alert("welcome");
          }}
        >
          say Welcome
        </button>
        <button
          onClick={() => {
            alert("I was clicked");
          }}
        >
          Click on me
        </button>
      </div>
      <h1 style={{ color: "green" }}>Currency Convertor!!!</h1>
      <div
        style={{ display: "flex", alignItems: "center", marginBottom: "10px" }}
      >
        <h3 style={{ marginRight: "10px" }}>Amount:</h3>
        <textarea ref={mon}></textarea>
      </div>

      <div
        style={{
          display: "flex",
          flexDirection: "column",
          alignItems: "flex-start",
        }}
      >
        <div
          style={{
            display: "flex",
            flexDirection: "column",
            alignItems: "center",
          }}
        >
          <div
            style={{
              display: "flex",
              alignItems: "center",
              marginBottom: "5px",
            }}
          >
            <h3 style={{ marginRight: "10px" }}>Currency:</h3>
            <textarea ref={curr}></textarea>
          </div>
          <button
            onClick={() => {
              var number = 0;
              try {
                number = Number(mon.current.value);
                if (curr.current.value !== "Euro") {
                  alert("Invalid Input");
                } else {
                  alert(`Converting to Euro: Amount is €${number * 0.0099}`);
                }
              } catch (e) {
                alert("Invalid Input");
              }
            }}
          >
            Submit
          </button>
        </div>
      </div>
    </div>
  );
}

export default App;
