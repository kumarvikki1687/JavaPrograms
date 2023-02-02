package DataStructure.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperations {
    /*
    .addFirst()         add at head/start
    .addLast()          add at tail/end
    .getFirst()         retrieve head but not delete
    .getLast()          retrieve tail but not delete
    .removeFirst()      retrieve & delete head
    .removeLast()       retrieve & delete tail
    .remove()           remove by index and don't return anything
     */
    LinkedList<Integer> linkedList = new LinkedList<>();

    void displayList() {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListOperations ob = new LinkedListOperations();

        ob.linkedList.addFirst(10);
        ob.linkedList.addLast(20);
        ob.linkedList.addFirst(30);
        ob.linkedList.addLast(40);
        ob.linkedList.addFirst(50);
        ob.linkedList.addLast(60);
        ob.displayList();
        System.out.println(ob.linkedList.getFirst());
        System.out.println(ob.linkedList.getLast());
        System.out.println(ob.linkedList.removeFirst());
        System.out.println(ob.linkedList.removeLast());
        ob.displayList();
        System.out.println(ob.linkedList.remove(2));
        ob.displayList();
    }
}
