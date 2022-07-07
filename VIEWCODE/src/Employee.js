import EmployeeIdGeneration from "./EmployeeIdGeneration";
import React, { useState } from "react";
import EmployeeSalary from "./EmployeeSalary";
import UseEffectExample from "./UseEffectExample";

export default function Employee(props) {

    return (
        <div>
            <h1>Employee Dashboard</h1>
            {props.e.map(employee => <p> {employee.empName}</p>)}

            <h3> Employee Id Generation </h3>

            <EmployeeIdGeneration />
            <UseEffectExample/>
        </div>







    );
}



export function EmployeeRegistrationForm(props) {
    const [employeeName, setEmployeeName] = useState("");
    const [age, setAge] = useState("");
    const [status, setStatus] = useState("");


    const handleSubmit = (evt) => {

        evt.preventDefault();
        alert(`Submitting Name ${employeeName + " " + age + " " + status}`)
    }
    return (

        <div>

            <EmployeeSalary/>

            <form onSubmit={handleSubmit}>
                <label>
                    Employee  Name:
                    <input
                        type="text"
                        value={employeeName}
                        onChange={e => setEmployeeName(e.target.value)}
                    />
                </label>

                <label>
                    Employee  Age:
                    <input
                        type="text"
                        value={age}
                        onChange={e => setAge(e.target.value)}
                    />
                </label>

                <label>
                    Employee  Status:
                    <input
                        type="text"
                        value={status}
                        onChange={e => setStatus(e.target.value)}
                    />
                </label>
                <input type="submit" value="Register Employee" />
            </form>
        </div>
    );
}