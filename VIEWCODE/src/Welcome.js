
import E, { EmployeeRegistrationForm } from './Employee';



function Welcome() {


    const empList = [
        { id: 1, empName: "Ravi", status: "p" },
        { id: 2, empName: "Ramesh", status: "a" },
        { id: 3, empName: "Durga", status: "a" }
      ];



    return (
        <div>
            <a href="createorder"> Create Order</a>
            <a href="createproduct"> Create Product</a>
            <a href="createcustomer"> Create Customer</a>
            <E e={empList}/>

            <EmployeeRegistrationForm/>
        </div>
    );
}


export function head() {
    return (
        <div>
            <a href="createorder"> Create Order</a>
            <a href="createproduct"> Create Product</a>
            <a href="createcustomer"> Create Customer</a>
        </div>
    );
}




export default Welcome;
