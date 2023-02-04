package OOPS.Abstraction;

/*
1>  0 to 100%  abstraction
2>  declared with abstract keyword
3>  can have abstract as well as non-abstract methods
4>  cannot be instantiated
 */

abstract class Bank {
    abstract int getInterestRate();     // abstract method

    void displayRate() {System.out.println("Display: ");}   // non-abstract method
}

class SBI extends Bank {
    int getInterestRate() {
        return 8;
    }
}
class PNB extends Bank {
    int getInterestRate() {
        return 6;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Bank obj = new SBI();
        System.out.println("SBI rate: " + obj.getInterestRate());
        obj = new PNB();
        System.out.println("PNB rate: " + obj.getInterestRate());
    }
}
