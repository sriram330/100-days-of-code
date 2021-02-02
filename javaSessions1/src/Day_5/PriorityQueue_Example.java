/*
Priority queue does not have any ends.
In a priority queue, elements can be inserted in any order but removal of the elements is in a sorted order.
Due to this behavior, a priority queue can be used to sort the elements.
 */

package Day_5;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_Example {
    public static void main(String[] args) {

        PriorityQueue<String> icecreamLine  = new PriorityQueue<String>();
        icecreamLine.add("Manish");
        icecreamLine.add("Shami");
        icecreamLine.add("Khan");



        Iterator<String> queue = icecreamLine.iterator();
       while (queue.hasNext()){
           System.out.println(queue.next());
       }
        icecreamLine.poll();
        System.out.println("After poll"+ icecreamLine);

        icecreamLine.offer("Mayank");
        System.out.println("New queue"+ icecreamLine);
    }
}
