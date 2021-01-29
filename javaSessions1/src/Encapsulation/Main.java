package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Employee E = new Employee();
        E.setEmp_ID(1014);
        E.setName("Agent456");

        System.out.println(" Name is : "+ E.getName());
        System.out.println(" Emp Id is : "+E.getEmp_ID());
    }
}
