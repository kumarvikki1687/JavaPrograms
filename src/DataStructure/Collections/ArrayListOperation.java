package DataStructure.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperation {
    /*
    .add()              add element at end
    .get()              get element by index
    .set()              set value at specific location
    .contains()         check if element present in list
    .remove()           remove element by index
    .indexOf()          get index by element
    .size()             return size of element
    .clear()            clear list
    */
    ArrayList<Integer> arrList = new ArrayList<>();

    private void displayArrList() {
        Iterator it = arrList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayListOperation ob = new ArrayListOperation();

        ob.arrList.add(10);
        ob.arrList.add(20);
        ob.arrList.add(30);
        ob.arrList.add(40);
        ob.arrList.add(50);

        ob.displayArrList();
        System.out.println(ob.arrList.get(2));
        ob.arrList.set(2,300);
        ob.displayArrList();
        System.out.println(ob.arrList.contains(300));
        System.out.println(ob.arrList.remove(2));
        ob.displayArrList();
        System.out.println(ob.arrList.contains(300));
        System.out.println(ob.arrList.indexOf(40));
        System.out.println(ob.arrList.size());
        ob.displayArrList();
        ob.arrList.clear();
        System.out.println(ob.arrList.size());
    }
}
