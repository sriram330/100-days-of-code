/*
Day_3_Encapsulation simply means binding object state and behaviour together. Also known as data hiding.

The whole idea behind encapsulation is to hide the implementation details from users.

If a data member is private it means it can only be accessed within the same class.

*/
package Day_3_Encapsulation;

public class Employee {

    private String employee_Name ="Agent";
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
* Read only:
A read-only class is a class in which you can access the values of the variables but cannot change them.
It is possible to change a class to a read-only class by deleting its setter methods.

* Write only:
classes that allow you to write onto variables but not read them.
This essentially means that you can edit a variable but cannot see it or view its value.
We can make a class as write-only by deleting the getter methods from the class definition.

Advantages of Day_3_Encapsulation:
Data Hiding
Increased Flexibility -- We can make the variables of the class as read-only or write-only depending on our requirement.
Reusability:

 */

