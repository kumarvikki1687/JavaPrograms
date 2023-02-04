package DataStructure.Collections.Map;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapOperation {
    /*
    Red-Black Tree to storage, elements stored sorted order.

    .put(key,value)         O(logn)     add element to hashset
    .get(key)               O(1)        get value WRT key
    .remove(key)            O(logn)     remove by element and return it
    .containsKey()          O(1)        check if key present or not
    .containsValue()        O(n)        check if value present or not
    .size()                 O(1)        return size
    .clear()                O(1)        clear hashset
     */
    TreeMap<Integer, String> treeMap = new TreeMap();

    private void displayLinkedHashMap() {
        for(Map.Entry<Integer, String> entry: treeMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeMapOperation ob = new TreeMapOperation();
        ob.treeMap.put(3, "Vikas");
        ob.treeMap.put(1, "Alok");
        ob.treeMap.put(2, "Chandan");
        ob.treeMap.put(6, "Vikki");
        ob.treeMap.put(-1, "Random");
        System.out.println(ob.treeMap.get(4));
        System.out.println(ob.treeMap.containsKey(1));
        System.out.println(ob.treeMap.containsValue("Random"));
        ob.displayLinkedHashMap();
        System.out.println(ob.treeMap.remove(5));
        ob.displayLinkedHashMap();
        System.out.println("Size is: " + ob.treeMap.size());
        ob.treeMap.clear();
        System.out.println("Size is: " + ob.treeMap.size());
        ob.displayLinkedHashMap();
    }
}

