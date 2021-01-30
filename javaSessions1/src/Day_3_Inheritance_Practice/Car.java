/*
 * Java inheritance refers to the ability of a Java Class to inherit the properties from some other Class.
 *
 * Method Overriding : When same method is present in parent and child class with same number of arguments and parameters

 * Code Reusability:  reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class.
 */
package Day_3_Inheritance_Practice;

class Vehicle {
    public void stop() {
        System.out.println("Inside vehicle >> Stop ");
    }
}

public class Car extends Vehicle {  //Parent or SuperClass

    //Method Overriding
    public void start() {
        System.out.println("Car -- Start");
    }

    public void stop() {
        System.out.println("Car -- Stop");
    }

}

class BMW extends Vehicle {  //Baseclass

    //Overridden method
    public void start() {
        System.out.println("BMW -- Start");
    }

    public void theftSafety() {
        System.out.println("BMW -- Theft safety");
    }

    public void stop() {
        super.stop();

    }

}


/*
Class A -> B    -- Single Inheritance
Class A ->B -> C -- Multilevel Inheritance
One class is inherited by many sub classes. -- Hierarchical Inheritance
Combination of Single and Multiple inheritance  -- By using interfaces you can have multiple as well as Hybrid inheritance in Java.
 */