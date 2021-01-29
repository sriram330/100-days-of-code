/* A constructor initializes an object when it is created.

 Constructors are used to give initial values to the instance variables defined by the class

 Java automatically provides a default constructor that initializes all member variables to zero.
 However, once you define your own constructor, the default constructor is no longer used.

Types:
1. No Arguement Constructors:
Using these constructors the instance variables of a method will be initialized with fixed values for all objects.

2. Paramterized Constructors
Accepts a specific number of parameters. To initialize data members of a class with distinct values.
 */

package Constructors;
public class Emp_Details {

    String name1;
    String Designation;
    int age;

    //No arguement Constructor
    public Emp_Details(){
        String name = "Khan";
        System.out.println("Original Name is " +name);
    }

//Parameterized Constructor
public Emp_Details(String name,int age, String Designation){

    //this keyword is used to refer to the instance variable of a class.

    name1 = name;
    this.age=age;
    this.Designation=Designation;
}

public static void main(String[] args){
        new Emp_Details();

    Emp_Details obj1= new Emp_Details("Arun",29,"Employee");

    System.out.println(obj1.name1 +" "+obj1.age +" "+obj1.Designation+" ");

}
}