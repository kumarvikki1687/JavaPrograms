package DataStructure.Collections.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperations {
    /*
    uses doubly linked list, duplicate elements, maintain insertion order, non-synchronized

    .addFirst()         O(1)        add at head/start
    .addLast()          O(n)        add at tail/end
    .getFirst()         O(1)        retrieve head but not delete
    .getLast()          O(n)        retrieve tail but not delete
    .contains()         O(n)        check if element present in list
    .removeFirst()      O(1)        retrieve & delete head
    .removeLast()       O(n)        retrieve & delete tail
    .remove()           O(n)        remove by index and don't return anything

    Collections.sort()  (nlogn)
     */
    LinkedList<Integer> linkedList = new LinkedList<>();

    void displayList() {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    private void displayUsingAuto() {           // iterating using for auto loop
        for(Integer it : linkedList) {
            System.out.print(it + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListOperations ob = new LinkedListOperations();

        ob.linkedList.addFirst(30);
        ob.linkedList.addLast(10);
        ob.linkedList.addFirst(20);
        ob.linkedList.addLast(60);
        ob.linkedList.addFirst(40);
        ob.linkedList.addLast(50);
        ob.displayList();
        System.out.println(ob.linkedList.getFirst());
        System.out.println(ob.linkedList.getLast());
        System.out.println(ob.linkedList.removeFirst());
        System.out.println(ob.linkedList.removeLast());
        ob.displayList();
        System.out.println(ob.linkedList.remove(2));
        ob.displayList();
        ob.linkedList.addFirst(70);
        System.out.println("contain in list: " + ob.linkedList.contains(10));

        System.out.print("Before Sorting:          ");
        ob.displayUsingAuto();

        Collections.sort(ob.linkedList);
        System.out.print("After Sorting:           ");
        ob.displayUsingAuto();

        Collections.sort(ob.linkedList, Collections.reverseOrder());
        System.out.print("After reverse Sorting:   ");
        ob.displayUsingAuto();
    }
}
