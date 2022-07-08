import React from "react";
import {
    BrowserRouter,
    Routes,
    Route,
    Link
} from "react-router-dom";

import Home from './Home';

import EmployeeManagement from './EmployeeManagement';

import Dashboard from './Dashboard';

import About from './About';

import EmployeeRegistration from './EmployeeRegistration';
import EditEmployee from './EditEmployee';





import Employee from "./Employee";
// This site has 3 pages, all of which are rendered
// dynamically in the browser (not server rendered).
//
// Although the page does not ever refresh, notice how
// React Router keeps the URL up to date as you navigate
// through the site. This preserves the browser history,
// making sure things like the back button and bookmarks
// work properly.

export default function LandingPage() {
    return (
        <div>
            <BrowserRouter>

                <h1> Online Shopping Portal</h1>
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/about">About</Link>
                    </li>
                    <li>
                        <Link to="/dashboard">Dashboard</Link>
                    </li>
                    <li>
                        <Link to="/employeeManagement">Employee Management</Link>
                    </li>

                   
                </ul>

                <hr />

                {/*
          A <Switch> looks through all its children <Route>
          elements and renders the first one whose path
          matches the current URL. Use a <Switch> any time
          you have multiple routes, but you want only one
          of them to render at a time
        */}


                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="about" element={<About />} />
                    <Route path="dashboard" element={<Dashboard />} />
                    <Route path="employeeManagement" element={<EmployeeManagement />} />
                    <Route path="registerNewEmployee" element={<EmployeeRegistration/>} />
                    <Route path="editEmployee/:empId" exact={true} element={<EditEmployee/>} />

                </Routes>

            </BrowserRouter>


        </div>
    );
}