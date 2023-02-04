package OOPS.Abstraction;

interface Printable{
    void print();
}
interface Showable{
    void print();
}

class TestMultipleInheritance implements Printable, Showable {
    public void print() {
        System.out.println("Implementing multiple inheritance");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        TestMultipleInheritance ob = new TestMultipleInheritance();
        ob.print();
    }
}
