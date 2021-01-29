/*
Encapsulation simply means binding object state and behaviour together. Also known as data hiding.

The whole idea behind encapsulation is to hide the implementation details from users.

If a data member is private it means it can only be accessed within the same class.

*/
package Encapsulation;

public class Employee {

    private String employee_Name;
    private int employeeId;

    public void setName(String newEmployee_Name) {
        employee_Name = newEmployee_Name;
    }

    public String getName() {
        return employee_Name;
    }

    public void setEmp_ID(int newEmployeeId) {
        employeeId = newEmployeeId;
    }

    public int getEmp_ID() {
        return employeeId;
    }
}

/*
Advantages of Encapsulation:
Data Hiding
Increased Flexibility -- We can make the variables of the class as read-only or write-only depending on our requirement.
Reusability:

 */

