import React, { useState, useEffect } from "react";


export default function Dashboard() {

  let loaded = false;
  const [employee, setEmployee] = useState({});

  const [loading, setLoading] = useState(true)


  useEffect(() => {
    setLoading(true);

    async function listEmployees() {
      const response = await fetch('http://localhost:8080/employee/listEmp');
      const json = await response.json();
      setEmployee(json);
      console.log(json);
      loaded = true;
      setLoading(false);

    }
    listEmployees();
    console.log("Call fired....");
  }, []);

  if (loading) {
    return <p>Loading...</p>;
  }

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