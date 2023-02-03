package DataStructure.Collections.List;

import java.util.Iterator;
import java.util.Stack;

public class StackOperations {
    /*
    subclass of Vector, LIFO structure, contain all the method of vector along with below methods

    .push()         O(1)        add element at top
    .pop()          O(1)        return top element and remove it from stack
    .peek()         O(1)        return top element but not remove it
    .empty()        O(1)        return boolean if stack is empty or not
    .size()         O(1)        return size of stack
    .contains()     O(n)        check if element present in stack
     */
    Stack<Integer> stk = new Stack<>();

    private void displayStack() {
        Iterator it = stk.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    private void displayUsingAuto() {           // iterating using for auto loop
        for(Integer it : stk) {
            System.out.print(it + " ");
        }
        System.out.println();
    }

    private void popOneByOne() {
        while (!stk.empty()) {
            System.out.print(stk.pop() + " ");
        }
    }

    public static void main(String[] args) {
        StackOperations ob = new StackOperations();

        ob.stk.push(1);
        ob.stk.push(2);
        ob.stk.push(3);
        ob.stk.push(4);
        ob.stk.push(5);
        ob.displayStack();
        System.out.println(ob.stk.peek());
        ob.displayStack();
        System.out.println(ob.stk.pop());
        ob.displayStack();
        System.out.println("Size is: " + ob.stk.size());
        System.out.println("contain in stack: " + ob.stk.contains(2));
        ob.displayUsingAuto();
        ob.popOneByOne();
    }
}
