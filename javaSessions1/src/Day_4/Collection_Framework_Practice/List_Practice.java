/*
* List in Java provides the facility to maintain the ordered collection.
* It contains the index-based methods to insert, update, delete and search the elements.
* It can have the duplicate elements also. We can also store the null elements in the list.
* The implementation classes of List interface are ArrayList, LinkedList, Stack and Vector.
*
*
* An ArrayList is a re-sizable array, also called a dynamic array which allows duplicate and null values.
* Maintains the insertion order
* We cannot create an ArrayList of primitive types like int, char etc. You need to use boxed types like Integer, Character, Boolean etc.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class List_Practice {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

// Adding elements in the list.
        al.add("Manish");
        al.add("Shami");
        System.out.println("Original insertion array list order: " +al);

        al.add(0, "Rossi");
        al.add("-> Manish");
        System.out.println("After adding duplicate element :");

        for (String newal: al) {
            System.out.println(newal);
            
        }
    }

}
