package DataStructure.Collections.Deque;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class CustomComp implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
        return i2 - i1;     // decreasing order/max heap
    }
}

public class PriorityQueueOperations {

    /*
    uses heap DS

    .add()          O(logn)     add element
    .peek()         O(1)        get element of head
    .pool()         O(logn)     get and remove element of head
    .remove()       O(n)        remove element by object and return boolean
    .size()         O(1)        return size of element
    .clear()        O(1)        clear list
     */
    PriorityQueue<Integer> pq = new PriorityQueue();    // no need to pass CustomComp if min
                                                        // heap required

    // PriorityQueue<Integer> pq = new PriorityQueue(new CustomComp());    // for max heap

    void displayPQ() {
        Iterator it = pq.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    void removeElementFromPQ() {
        while(!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueOperations ob = new PriorityQueueOperations();

        ob.pq.add(5);
        ob.pq.add(1);
        ob.pq.add(3);
        ob.pq.add(2);
        ob.pq.add(4);

        System.out.println("Size is: " + ob.pq.size());

        ob.displayPQ();     // not guarantee sorted order but must have heap property
        System.out.println("Head is: " + ob.pq.peek());
        System.out.println("Removed object: " + ob.pq.remove(3));
        ob.pq.add(30);
        ob.removeElementFromPQ();
        System.out.println("Head is: " + ob.pq.peek());
        System.out.println("Size is: " + ob.pq.size());
    }
}
