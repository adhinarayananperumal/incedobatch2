import React, { Component } from "react";


export default class EmployeeSalary extends React.Component {
    constructor(props) {
        super(props);
        console.log("Constructor is called from Employee salary")
        this.state = { date: new Date() };
    }

    tick() {
        this.setState({
            date: new Date()
        });
    }


    componentDidMount() {
        console.log("Component did mount is called from Employee salary")

        this.timerID = setInterval(
            () => this.tick(),
            1000
        );
    }

    componentWillUnmount() {
        clearInterval(this.timerID);
        console.log("componentWillUnmount is called from Employee salary")

    }



    render() {
        return (
            <div>
                <h1>Employee Salary Details</h1>
                <h2>It is {this.state.date.toLocaleTimeString()}.</h2>
            </div>
        );
    }
}
