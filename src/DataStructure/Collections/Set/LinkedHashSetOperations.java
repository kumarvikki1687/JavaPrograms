package DataStructure.Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetOperations {
    /*
    LinkedList to storage, order guaranteed

    .add()          add element to linkedHashset
    .remove()       remove by element and return it
    .contain()      check if element present in linkedHashset
    .size()         return size
    .clear()        clear linkedHashset
     */
    LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

    private void displayLinkedHashSet() {
        Iterator it = lhs.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    private void displayUsingAuto() {           // iterating using for auto loop
        for(Integer it : lhs) {
            System.out.print(it + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedHashSetOperations ob = new LinkedHashSetOperations();

        ob.lhs.add(2);
        ob.lhs.add(4);
        ob.lhs.add(1);
        ob.lhs.add(3);
        ob.lhs.add(5);
        ob.displayLinkedHashSet();
        System.out.println("Contain in LinkedHashSet: " + ob.lhs.contains(3));
        ob.lhs.remove(3);
        System.out.println("Contain in LinkedHashSet: " + ob.lhs.contains(3));
        System.out.println("Size: " + ob.lhs.size());
        ob.displayUsingAuto();
        ob.lhs.clear();
        System.out.print("After clear: ");
        ob.displayUsingAuto();
    }
}
