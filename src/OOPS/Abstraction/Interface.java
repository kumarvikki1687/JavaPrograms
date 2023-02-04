package OOPS.Abstraction;

/*
1>  100%  abstraction
2>  declared with interface keyword
3>  can have only abstract methods
4>  can support the functionality of multiple inheritance
 */

interface Bank1 {
    float rateOfInterest();
}
class SBI1 implements Bank1 {
    public float rateOfInterest(){return 9.15f;}
}
class PNB1 implements Bank1 {
    public float rateOfInterest(){return 9.7f;}
}

public class Interface {
    public static void main(String[] args) {
        Bank1 b = new SBI1();
        System.out.println("SBI ROI: "+b.rateOfInterest());
        b = new PNB1();
        System.out.println("PNB ROI: "+b.rateOfInterest());
    }
}
