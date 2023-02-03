package DataStructure.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
    /*
    hash table to storage, order not guaranteed

    .add()          O(1)        add element to hashset
    .remove()       O(1)        remove by element and return it
    .contain()      O(1)        check if element present in hashset
    .size()         O(1)        return size
    .clear()        O(1)        clear hashset
     */
    HashSet<Integer> hs = new HashSet<>();

    private void displayHashSet() {
        Iterator it = hs.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
     }

    private void displayUsingAuto() {           // iterating using for auto loop
        for(Integer it : hs) {
            System.out.print(it + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HashSetOperations ob = new HashSetOperations();

        ob.hs.add(2);
        ob.hs.add(4);
        ob.hs.add(1);
        ob.hs.add(3);
        ob.hs.add(5);
        ob.displayHashSet();
        System.out.println("Contain in HashSet: " + ob.hs.contains(3));
        ob.hs.remove(3);
        System.out.println("Contain in HashSet: " + ob.hs.contains(3));
        System.out.println("Size: " + ob.hs.size());
        ob.displayUsingAuto();
        ob.hs.clear();
        System.out.print("After clear: ");
        ob.displayUsingAuto();
    }
}
