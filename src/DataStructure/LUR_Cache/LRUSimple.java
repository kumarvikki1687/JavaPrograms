package DataStructure.LUR_Cache;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUSimple {

    int capacity;
    Deque<Integer> lru;
    HashSet<Integer> hashSet;

    LRUSimple(int capacity) {
        this.capacity = capacity;
        lru = new LinkedList<>();       // deque with linkedList implementation
        hashSet = new HashSet<>();
    }

    private void pushToLru(int page) {      // O(1)
        if(hashSet.contains(page)) {
            lru.remove(page);
        } else {
            if(lru.size()==capacity) {
                int lastPage = lru.removeLast();
                hashSet.remove(lastPage);
            }
        }
        lru.addFirst(page);
        hashSet.add(page);
    }

    void displayLruCache() {
        Iterator it = lru.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRUSimple ob = new LRUSimple(3);

        ob.pushToLru(1);
        ob.pushToLru(2);
        ob.pushToLru(3);
        ob.pushToLru(1);
        ob.pushToLru(4);
        ob.pushToLru(5);

        ob.displayLruCache();
    }
}
