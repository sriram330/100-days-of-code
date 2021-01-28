package javaSessions;


//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces


//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
//If there is an abstract method in a class, that class must be abstract.
//If you are extending an abstract class that has an abstract method,
// you must either provide the implementation of the method or make this class abstract class

    abstract class Bank {
        abstract int getInterestRate();
    }
    //concrete class
    class Citi extends Bank{
        int getInterestRate()
        {
            return 7;}
    }
    //concrete class
    class HDFC extends Bank{
        int getInterestRate()
        {
            return 6;
        }
    }

    class Main{
        public static void main(String args[]){


            Bank b;
            b = new Citi ();      // concrete class object
            System.out.println("javaSessions.Citi Rate of Interest is: "+b.getInterestRate()+"%");
            b = new HDFC ();        // concrete class object
            System.out.println("javaSessions.HDFC Rate of Interest is: "+b.getInterestRate()+"%");

        }

    }

//      In Automation Framework:

//      In Page Object Model design pattern, we write locators (such as id, name, xpath etc.,)
//      in a Page Class. We utilize these locators in tests but we can’t see these locators in the tests.
//      Literally we hide the locators from the tests.





