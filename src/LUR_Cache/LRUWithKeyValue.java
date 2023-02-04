package LUR_Cache;

import java.util.*;

public class LRUWithKeyValue {

    int capacity;
    Deque<Integer> lru;                 // deque with linkedList implementation
    HashMap<Integer,Integer> cache;

    LRUWithKeyValue(int capacity) {
        this.capacity = capacity;
        this.lru = new LinkedList<>();
        this.cache = new HashMap<>();
    }

    private void pushToLru(int key, int value) {
        if(cache.containsKey(key)) {
            lru.remove(key);
            cache.remove(key);
        } else {
            if(lru.size()==capacity) {
                int lastKey = lru.removeLast();
                cache.remove(lastKey);
            }
        }
        lru.addFirst(key);
        cache.put(key,value);
    }

    void displayCacheWithoutOrder() {       // since hashmap don't maintain order
        for(Map.Entry<Integer,Integer> it: cache.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }
        System.out.println();
    }

    void displayCacheWithOrder() {
        for(Integer it: lru) {
            System.out.println(it + "->" + cache.get(it));
        }
        System.out.println();
     }

     private int getFromCache(int key) {
        if(!cache.containsKey(key)) {
            return -1;
        }
        lru.remove(key);
        lru.addFirst(key);
        return cache.get(key);
     }

    public static void main(String[] args) {
        LRUWithKeyValue ob = new LRUWithKeyValue(3);

        ob.pushToLru(1, 10);
        ob.pushToLru(2, 20);
        ob.pushToLru(3, 30);
        ob.pushToLru(1, 100);
        System.out.println("Get from cache 2->"  + ob.getFromCache(2));
        System.out.println("Get from cache 3->"  + ob.getFromCache(3));
        ob.pushToLru(4, 40);
        ob.pushToLru(5, 50);

        System.out.println("Cache display without order:");
        ob.displayCacheWithoutOrder();

        System.out.println("Cache display with order:");
        ob.displayCacheWithOrder();
    }
}
