package Day_1;

//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces




//An interface is a completely "abstract class" that is used to group related methods with empty bodies
//Interface methods do not have a body - the body is provided by the "implement" class
//Interface methods are by default abstract and public

//declare an interface
interface Animal {
    public void eat();
    public void travel();
    public int noOfLegs();
}

class MammalInt implements Animal {

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 4;
    }

    public static void main(String args[]) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
        System.out.println(m.noOfLegs());
    }
}









