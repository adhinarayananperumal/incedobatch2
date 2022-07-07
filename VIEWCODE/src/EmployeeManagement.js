import React from "react";
import {
  Link,
  Routes,Route
} from "react-router-dom";
import Employee from "./Employee";



export default function EmployeeManagement() {
  return (

    <div>
      
      <h2>Employee Management </h2>

      <ul>
        <li>
          <Link to="/registerNewEmployee">Register new Employee</Link>
        </li>
        <li>
          <Link to="/updateEmployeeDetails">Update employee details</Link>
        </li>
        <li>
          <Link to="/deleteEmployee">Delete Employee</Link>
        </li>
      </ul>
      <hr />

    </div>
  );
}