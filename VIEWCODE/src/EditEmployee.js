
import React, { useEffect, useState } from 'react';
import { Link, useNavigate, useParams } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';

export default function Editemployee() {


    const empInitial = {
        empId: '',
        employeeName: '',
        age: '',
        status: ''
    };

    let loaded = false;

    const [employee, setEmployee] = useState(empInitial);
    const [loading, setLoading] = useState(true);

    const navigate = useNavigate();
    const { empId } = useParams();

    useEffect(() => {
        alert("use effort called u");
        alert(empId);
        async function getEmp() {
            const response = await fetch(`http://localhost:8080/employee/getEmp/${empId}`);
            const json = await response.json();
            setEmployee(json);
            console.log(json);
            loaded = true;
            setLoading(false);
        }
        getEmp();
    }, [empId, setEmployee]);





    const handleChange = (event) => {
        const { name, value } = event.target
        setEmployee({ ...employee, [name]: value })
    }


    const handleSubmit = (evt) => {

        evt.preventDefault();
        alert(`Submitting Name.................www ${employee.employeeName + "...." + employee.age + " " + employee.status}`);

        fetch('http://localhost:8080/employee/updateEmp', {
            method: 'put',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(employee)
        }).then((response) => console.log(response)).catch(console.log("error"));

        setEmployee(empInitial);
        navigate('/dashboard');
    }


    return (
    
    <div>
<Container>
        <Form onSubmit={handleSubmit}>

        <FormGroup>
            <Label for="employeeName">Employee Id</Label>
            <Input type="text" name="empId" id="empId" value={employee.empId || ''}
                   onChange={handleChange} autoComplete="empId"/>
          </FormGroup>

          <FormGroup>
            <Label for="employeeName">Employee Name</Label>
            <Input type="text" name="employeeName" id="employeeName" value={employee.employeeName || ''}
                   onChange={handleChange} autoComplete="employeeName"/>
          </FormGroup>

          <FormGroup>
            <Label for="employeeName">Employee Age</Label>
            <Input type="text" name="age" id="age" value={employee.age || ''}
                   onChange={handleChange} autoComplete="age"/>
          </FormGroup>

          <FormGroup>
            <Label for="employeeName">Employee Status</Label>
            <Input type="text" name="status" id="status" value={employee.status || ''}
                   onChange={handleChange} autoComplete="status"/>
          </FormGroup>
          <input type="submit" value="Update Employee" />

        </Form>
      </Container>
    </div>
      
    )

}