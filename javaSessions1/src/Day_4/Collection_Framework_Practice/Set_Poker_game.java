/*
Set is a type of collection that does not allow duplicate elements. That means an element can only exist once in a Set.
Elements are not stored in order.

HashSet: is the best-performing implementation and is a widely-used Set implementation.
It represents the core characteristics of sets: no duplication and unordered.

LinkedHashSet: This implementation orders its elements based on insertion order.
 So consider using a LinkedHashSet when you want to store unique elements in order.

TreeSet: This implementation orders its elements based on their values by their natural ordering.
 or by a Comparator provided at creation time.

 */
package Day_4.Collection_Framework_Practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Poker_game {

    public static void main(String[] args) {
        Set<String> Poker = new LinkedHashSet<>();
        Poker.add("Spades 10");
        Poker.add("Jack");
        Poker.add("Queen");
        Poker.add("King");
        Poker.add("Jack");

        System.out.println("Set using LinkedHashSet :" +Poker);

        if(Poker.remove("Jack")){
            System.out.println("Jack is removed from the user01");
        }
        Iterator<String> UserCards =Poker.iterator();
        System.out.println("Remaining cards :");
        while(UserCards.hasNext()){
            System.out.println(UserCards.next());
        }


    }
}
