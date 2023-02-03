package DataStructure.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListOperation {
    /*
    uses dynamic array, duplicate elements, maintain insertion order, non-synchronized

    .add()          O(1)        add element at end
    .get()          O(1)        get element by index
    .set()          O(1)        set value at specific location
    .contains()     O(n)        check if element present in list
    .remove()       O(n)        remove element by index and return it
    .indexOf()      O(n)        get index by element
    .size()         O(1)        return size of element
    .clear()        O(1)        clear list

    Collections.sort()  (nlogn)
    */
    ArrayList<Integer> arrList = new ArrayList<>();

    private void displayArrList() {
        Iterator it = arrList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    private void displayArrListWithForLoop() {          // iterate using for loop
        for(int i=0;i<arrList.size();i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();
    }

    private void displayUsingAuto() {           // iterating using for auto loop
        for(Integer it : arrList) {
            System.out.print(it + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayListOperation ob = new ArrayListOperation();

        ob.arrList.add(40);
        ob.arrList.add(30);
        ob.arrList.add(20);
        ob.arrList.add(50);
        ob.arrList.add(10);

        ob.displayArrList();
        System.out.println(ob.arrList.get(2));
        ob.arrList.set(2,200);
        ob.displayArrList();
        System.out.println(ob.arrList.contains(200));
        System.out.println(ob.arrList.remove(2));
        ob.displayArrList();
        System.out.println(ob.arrList.contains(200));
        System.out.println(ob.arrList.indexOf(40));
        System.out.println(ob.arrList.size());
        ob.displayArrList();
        ob.displayArrListWithForLoop();

        System.out.print("Before Sorting:   ");
        ob.displayUsingAuto();

        Collections.sort(ob.arrList);                   // sort arrayList increasing order
        System.out.print("After Sorting:    ");
        ob.displayUsingAuto();

        Collections.sort(ob.arrList, Collections.reverseOrder());   // sort arrayList decreasing order
        System.out.print("After reverse Sorting:    ");
        ob.displayUsingAuto();

        ob.arrList.clear();
        System.out.println("Size: " + ob.arrList.size());
    }
}
