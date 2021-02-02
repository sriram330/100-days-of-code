/*
* In FIFO, first element is removed first and last element is removed at last.
* Java Queue interface orders the element in FIFO(First In First Out) manner.
* It is an ordered list of objects with its use limited to insert elements at the end of the list and
* Deletes elements from the start of the list.

* Since Queue is an interface, objects cannot be created of the type queue.
* We always need a class which extends this list in order to create an object.
 */



package Day_5;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Practice {

    public static void main(String[] args) {
        Queue<String> icecreamLine  = new LinkedList<String>();
        icecreamLine.add("Manish");
        icecreamLine.add("Shami");
        icecreamLine.add("Khan");


        System.out.println("persons in the queue: " +icecreamLine);

        System.out.println(icecreamLine.peek());

        icecreamLine.poll();
        System.out.println("remaining persons in queue: "+icecreamLine);

        icecreamLine.offer("Mayank");
        System.out.println("New queue"+ icecreamLine);



    }

}






/*
boolean add(object)	  -> It is used to insert the specified element into this queue and return true upon success.
boolean offer(object) ->It is used to insert the specified element into this queue.
Object remove()	      -> It is used to retrieves and removes the head of this queue.
Object poll()	      -> It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
Object peek()	      -> It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

 */