package Deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeOperation {
    /*
    .addFirst()     add at head/start
    .addLast()      add at tail/end
    .getFirst()     retrieve head but not delete
    .getLast()      retrieve tail but not delete
    .removeFirst()  retrieve & delete head
    .removeLast()   retrieve & delete tail
    .remove()       remove by element and return flag as true
     */
    Deque<Integer> dq = new LinkedList<>();

    void displayDeque() {
        Iterator<Integer> it = dq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DequeOperation ob = new DequeOperation();

        ob.dq.addFirst(10);
        ob.dq.addLast(20);
        ob.dq.addFirst(30);
        ob.dq.addLast(40);
        ob.dq.addFirst(50);
        ob.dq.addLast(60);
        ob.displayDeque();
        System.out.println(ob.dq.getFirst());
        System.out.println(ob.dq.getLast());
        System.out.println(ob.dq.removeFirst());
        System.out.println(ob.dq.removeLast());
        ob.displayDeque();
        System.out.println(ob.dq.remove(20));
        ob.displayDeque();
    }
}
