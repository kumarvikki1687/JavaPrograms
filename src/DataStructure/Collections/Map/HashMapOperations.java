package DataStructure.Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapOperations {
    /*
    hash table to storage, order not guaranteed

    .put(key,value)         O(1)        add element to hashset
    .get(key)               O(1)        get value WRT key
    .remove(key)            O(1)        remove by element and return it
    .containsKey()          O(1)        check if key present or not
    .containsValue()        O(1)        check if value present or not
    .size()                 O(1)        return size
    .clear()                O(1)        clear hashset
     */
    HashMap<Integer, String> hm = new HashMap();

    private void displayHashMap() {
        for(Map.Entry<Integer, String> entry: hm.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        System.out.println();
     }

    public static void main(String[] args) {
        HashMapOperations ob = new HashMapOperations();
        ob.hm.put(1, "Vikas");
        ob.hm.put(2, "Alok");
        ob.hm.put(3, "Chandan");
        ob.hm.put(4, "Vikki");
        ob.hm.put(5, "Random");
        System.out.println(ob.hm.get(4));
        System.out.println(ob.hm.containsKey(1));
        System.out.println(ob.hm.containsValue("Random"));
        ob.displayHashMap();
        System.out.println(ob.hm.remove(5));
        ob.displayHashMap();
        System.out.println("Size is: " + ob.hm.size());
        ob.hm.clear();
        System.out.println("Size is: " + ob.hm.size());
        ob.displayHashMap();
    }
}
