import React, { useState } from 'react';

export default function EmployeeIdGeneration() {
  // Declare a new state variable, which we'll call "count"
  const [count, setCount] = useState(0);

  const [companyName, setCompanyName] = useState("Incedo");


  return (
    <div>
        <h1> {companyName}</h1>
      <p>You clicked {count} times</p>
      <button onClick={() => setCount(count + 1)}>
        Click me
      </button>
    </div>
  );
}