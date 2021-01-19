package Abstraction_and_Interfaces;

//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces




//An interface is a completely "abstract class" that is used to group related methods with empty bodies
//Interface methods do not have a body - the body is provided by the "implement" class
//Interface methods are by default abstract and public

//declare an interface
interface TestInterface
{
    abstract void  printMethod(); //default visibility is public.
}
//interface implementation
class TestClass implements TestInterface
{
    //if the access modifier is changed to any other, compiler generates error
    public void printMethod()
    {
        System.out.println("Abstraction_and_Interfaces.TestClass::printMethod()");
    }
}

class MainClass{
    public static void main(String[] args)
    {
        TestClass tc = new TestClass();     //create an object
        tc.printMethod();                   //call concrete method
    }








}
