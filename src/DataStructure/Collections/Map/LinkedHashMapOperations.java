package DataStructure.Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapOperations {
    /*
    LinkedList to storage, order guaranteed

    .put(key,value)         O(1)        add element to hashset
    .get(key)               O(1)        get value WRT key
    .remove(key)            O(n)        remove by element and return it
    .containsKey()          O(1)        check if key present or not
    .containsValue()        O(n)        check if value present or not
    .size()                 O(1)        return size
    .clear()                O(1)        clear hashset
     */
    LinkedHashMap<Integer, String> lhm = new LinkedHashMap();

    private void displayLinkedHashMap() {
        for(Map.Entry<Integer, String> entry: lhm.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedHashMapOperations ob = new LinkedHashMapOperations();
        ob.lhm.put(1, "Vikas");
        ob.lhm.put(2, "Alok");
        ob.lhm.put(3, "Chandan");
        ob.lhm.put(4, "Vikki");
        ob.lhm.put(5, "Random");
        System.out.println(ob.lhm.get(4));
        System.out.println(ob.lhm.containsKey(1));
        System.out.println(ob.lhm.containsValue("Random"));
        ob.displayLinkedHashMap();
        System.out.println(ob.lhm.remove(5));
        ob.displayLinkedHashMap();
        System.out.println("Size is: " + ob.lhm.size());
        ob.lhm.clear();
        System.out.println("Size is: " + ob.lhm.size());
        ob.displayLinkedHashMap();
    }
}
