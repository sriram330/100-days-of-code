package Abstraction_and_Interfaces;//However, a class can inherit or implement more than one interface. In this case, it is known as multiple inheritance.
// So although we are not allowed to implement multiple inheritance in Java through classes, we can do so using interfaces.


//Abstraction_and_Interfaces.Interface_One declaration
interface Interface_One{
    void print();
}

//Abstraction_and_Interfaces.Interface_Two declaration
interface Interface_Two{
    void show();
}

//multiple inheritance - Abstraction_and_Interfaces.DemoClass implementing Abstraction_and_Interfaces.Interface_One&amp;Abstraction_and_Interfaces.Interface_Two
class DemoClass implements Interface_One,Interface_Two{
    public void print(){        //Override Abstraction_and_Interfaces.Interface_One print()
        System.out.println("Democlass::Interface_One_Print ()");
    }
    public void show(){         //Override Abstraction_and_Interfaces.Interface_Two show()
        System.out.println("Abstraction_and_Interfaces.DemoClass::Interface_Two_Show ()");
    }
}

public class Multiple_Interface{

    public static void main(String args[]){
        DemoClass obj = new DemoClass();  //create Abstraction_and_Interfaces.DemoClass object and call methods
        obj.print();
        obj.show();
    }
}