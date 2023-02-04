package Problems;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class CustCom implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
        return i2-i1;       // max heap
    }
}

public class KthSmallestElement {

    int capacity;
    PriorityQueue<Integer> pq;

    KthSmallestElement(int capacity) {
        this.capacity = capacity;
        pq = new PriorityQueue<>(new CustCom());
    }

    private void pushToPQ(int value) {
        if(pq.isEmpty()) {
            pq.add(value);
        }
        else if(pq.size()==capacity && value > pq.peek()) {     // do nothing
            return;
        } else if(pq.size()==capacity && value < pq.peek()) {
            pq.poll();
            pq.add(value);
        } else {
            pq.add(value);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity K: ");
        int capacity = sc.nextInt();

        KthSmallestElement ob = new KthSmallestElement(capacity);

        int arr[] = {3,4,1,10,2,5};

        for(int i=0;i<arr.length;i++) {
            // int element = sc.nextInt();
            // ob.pushToPQ(element);
            ob.pushToPQ(arr[i]);
            // System.out.println("PQ: " + ob.pq);
            if(ob.pq.size()==capacity) {
                System.out.println("Smallest element: " + ob.pq.peek());
            }
        }
    }
}
