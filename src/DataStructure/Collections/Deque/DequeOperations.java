package DataStructure.Collections.Deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeOperations {
    /*
    uses linkedList to implement interface Deque

    .addFirst()         O(1)        add at head/start
    .addLast()          O(n)        add at tail/end
    .getFirst()         O(1)        retrieve head but not delete
    .getLast()          O(n)        retrieve tail but not delete
    .contains()         O(n)        check if element present in list
    .removeFirst()      O(1)        retrieve & delete head
    .removeLast()       O(n)        retrieve & delete tail
    .remove()           O(n)        remove by index and don't return anything
     */
    Deque<Integer> dq = new LinkedList<>();

    void displayDeque() {
        Iterator it = dq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    private void displayUsingAuto() {           // iterating using for auto loop
        for(Integer it : dq) {
            System.out.print(it + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DequeOperations ob = new DequeOperations();

        ob.dq.addFirst(10);
        ob.dq.addLast(20);
        ob.dq.addFirst(30);
        ob.dq.addLast(40);
        ob.dq.addFirst(50);
        ob.dq.addLast(60);
        ob.displayDeque();
        System.out.println(ob.dq.getFirst());
        System.out.println(ob.dq.getLast());
        System.out.println(ob.dq.removeFirst());
        System.out.println(ob.dq.removeLast());
        ob.displayDeque();
        System.out.println(ob.dq.remove(20));
        ob.displayDeque();
        ob.displayUsingAuto();
    }
}
