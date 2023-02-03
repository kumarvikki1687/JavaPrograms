package DataStructure.Collections.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorOperations {
    /*
    similar to ArrayList, only diff is synchronized

    .add()          O(1)        add element at end
    .get()          O(1)        get element by index
    .set()          O(1)        set value at specific location
    .contains()     O(n)        check if element present in list
    .remove()       O(n)        remove element by index and return it
    .indexOf()      O(n)        get index by element
    .size()         O(1)        return size of element
    .clear()        O(1)        clear list
    .contains()     O(n)        check if element present in stack

    Collections.sort()  (nlogn)
    */
    Vector<Integer> vec = new Vector<>();

    private void displayVector() {
        Iterator it = vec.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    private void displayVectorWithForLoop() {          // iterate using for loop
        for(int i=0;i<vec.size();i++) {
            System.out.print(vec.get(i) + " ");
        }
        System.out.println();
    }

    private void displayUsingAuto() {           // iterating using for auto loop
        for(Integer it : vec) {
            System.out.print(it + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VectorOperations ob = new VectorOperations();

        ob.vec.add(30);
        ob.vec.add(10);
        ob.vec.add(20);
        ob.vec.add(50);
        ob.vec.add(40);

        ob.displayVector();
        System.out.println(ob.vec.get(2));
        ob.vec.set(2,300);
        ob.displayVector();
        System.out.println(ob.vec.contains(300));
        System.out.println(ob.vec.remove(2));
        ob.displayVector();
        System.out.println(ob.vec.contains(300));
        System.out.println(ob.vec.indexOf(40));
        System.out.println(ob.vec.size());
        ob.displayVector();
        ob.displayVectorWithForLoop();
        System.out.println("contain in vector: " + ob.vec.contains(20));

        System.out.print("Before Sorting:          ");
        ob.displayUsingAuto();

        Collections.sort(ob.vec);
        System.out.print("After Sorting:           ");
        ob.displayUsingAuto();

        Collections.sort(ob.vec, Collections.reverseOrder());
        System.out.print("After reverse Sorting:   ");
        ob.displayUsingAuto();

        ob.vec.clear();
        System.out.println(ob.vec.size());
    }
}
