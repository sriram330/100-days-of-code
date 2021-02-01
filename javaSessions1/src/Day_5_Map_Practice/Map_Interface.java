/*
A map contains values on the basis of key, i.e. key and value pair.
Each key and value pair is known as an entry. A Map contains unique keys.
A Map is useful if you have to search, update or delete elements on the basis of a key.

There are two interfaces for implementing Map in java -> Map and SortedMap
 Three classes ->  HashMap, LinkedHashMap, and TreeMap.

A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.

A Map doesn't allow duplicate keys, but you can have duplicate values.
 HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
 */

package Day_5_Map_Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Interface {
    public static void main(String[] args) {
        Map<Integer, String> employeeDetails = new HashMap<Integer, String>();

        employeeDetails.put(170, "Agent123");
        employeeDetails.put(171, "Vijay");
        employeeDetails.put(177, "Harris");
        employeeDetails.put(170, "Khan");  //duplicate
        employeeDetails.put(null, "AgentUnknown");


        // To convert it into Set
        // employeeDetails.entrySet();

        //Converting to Map.Entry so that we can get key and value separately
        for (Map.Entry m : employeeDetails.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        employeeDetails.remove(171);
        System.out.println(employeeDetails.containsKey("Vijay"));


    }
}






/*
HashMap is the implementation of Map, but it doesn't maintain any order.
LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
 */