/*
The java.util.Stack class represents a last-in-first-out (LIFO) stack of objects.

When a stack is first created, it contains no items.

In this class, the last element inserted is accessed first.

 */


import java.util.Stack;

public class Stack_Practice {
    public static void main(String[] args) {

        Stack gamesList = new Stack();
        gamesList.push("Call of duty");
        gamesList.push("Modern Warfare");
        gamesList.push("Mario");

        System.out.println(gamesList);

        System.out.println("First element is:  " +gamesList.peek());

        gamesList.pop();
        System.out.println("After pop operation:    " +gamesList);


    }
}


/*
 * boolean empty() -> This method tests if this stack is empty.
 * E peek() -> This method looks at the object at the top of this stack without removing it from the stack.
 * E pop() -> This method removes the object at the top of this stack and returns that object as the value of this function.
 * E push(E item) -> This method pushes an item onto the top of this stack.
 * int search(Object o)->  This method returns the 1-based position where an object is on this stack.
 */