import EmployeeIdGeneration from "./EmployeeIdGeneration";
import React, { useState } from "react";
import EmployeeSalary from "./EmployeeSalary";
import UseEffectExample from "./UseEffectExample";

export default function EmployeeRegistration(props) {

    return (
        <div>
            <h3>Employee Registration Form</h3>
            <EmployeeRegistrationForm />
        </div>
    );
}



export function EmployeeRegistrationForm(props) {

    const employeedet = {
        employeeName: '',
        age: '',
        status: '',
    };

    const [employee, setEmployee] = useState(employeedet);

    const handleChange = (event) => {
        const { name, value } = event.target
        setEmployee({ ...employee, [name]: value })
      }
    

    const handleSubmit = (evt) => {

        evt.preventDefault();
        alert(`Submitting Name.................www ${employee.employeeName + "...." + employee.age + " " + employee.status}`);

        fetch('http://localhost:8080/employee/createEmpReg',{
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(employee)
        }).then((response) => console.log(response)).catch(console.log("error"));

        alert("fetch called...........");

    }
    return (

        <div>


            <form onSubmit={handleSubmit}>
                <label>
                    Employee  Name:
                    <input name="employeeName"
                        type="text"
                        value={employee.employeeName}
                        onChange={handleChange}
                    />
                </label>
                <br />
                <label>
                    Employee  Age:
                    <input name="age"
                        type="text"
                        value={employee.age}
                        onChange={handleChange}
                    />
                </label>
                <br />
                <label>
                    Employee  Status:
                    <input name="status"
                        type="text"
                        value={employee.status}
                        onChange={handleChange}
                    />
                </label><br />
                <input type="submit" value="Register Employee" />
            </form>
        </div>
    );
}