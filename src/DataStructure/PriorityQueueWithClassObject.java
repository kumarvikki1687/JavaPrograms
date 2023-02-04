package DataStructure;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class CustomComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e2.salary - e1.salary;      // decreasing order/max heap
    }
}

public class PriorityQueueWithClassObject {

    /*
    uses heap DS

    .add()          O(logn)     add element
    .peek()         O(1)        get element of head
    .pool()         O(logn)     get and remove element of head
    .remove()       O(n)        remove element by object and return boolean
    .size()         O(1)        return size of element
    .clear()        O(1)        clear list
     */
    PriorityQueue<Employee> empInfo = new PriorityQueue<>(new CustomComparator());

    void displayEmployee() {
        for(Employee emp : empInfo) {
            System.out.println("ID: " + emp.id + " Name: " + emp.name + " Salary: " + emp.salary);
        }
        System.out.println();
    }

    void removeElementFromPQ() {
        while(!empInfo.isEmpty()) {
            Employee emp = empInfo.poll();
            System.out.println("ID: " + emp.id + " Name: " + emp.name + " Salary: " + emp.salary);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueueWithClassObject ob = new PriorityQueueWithClassObject();

        ob.empInfo.add(new Employee(1, "Alok", 10000));
        ob.empInfo.add(new Employee(2, "Vikas", 15000));
        ob.empInfo.add(new Employee(3, "Vikki", 6000));
        ob.empInfo.add(new Employee(4, "Chandan", 8000));
        ob.empInfo.add(new Employee(5, "Random", 2000));

        System.out.println("Size is: " + ob.empInfo.size());

        ob.displayEmployee();     // not guarantee sorted order but must have heap property
        System.out.println("Head is: " + ob.empInfo.peek().name);
        System.out.println();
        // System.out.println("Removed object: " + ob.empInfo.remove(3));
        ob.removeElementFromPQ();
        System.out.println("Size is: " + ob.empInfo.size());

    }
}
