import React, { useState, useEffect } from "react";


export default function Dashboard() {

  const [isLoaded, setIsLoaded] = useState(false);

  const [employee, setEmployee] = useState({});

  useEffect(() => {
    async function listEmployees() {
      const response = await fetch('http://localhost:8080/employee/listEmp');
      const json = await response.json();
      setEmployee(json);
      console.log(json);
      isLoaded = true;
      alert("ererfhfeyre");
    }
    listEmployees();
    console.log("Call fired....");
  }, []);

  return (
    <div>
      <h2>Our dashboard details</h2>
      <table border="2">
        <thead>
          <tr>
            <th width="30%">Emp Id</th>
            <th width="30%">Employee Name</th>
            <th width="30%">Age</th>
            <th width="40%">Status</th>
          </tr>
        </thead>
        <tbody>
          {

            employee.listEmp.map(e => (
              <tr>
                <td> {e.empId}</td>
                <td >{e.employeeName}</td>
                <td >{e.age}</td>
                <td >{e.status}</td>
              </tr>
            ))


          }

        </tbody>
      </table>

    </div>

  )
}