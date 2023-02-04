package OOPS.Polimorphism;

/*
1> If child class has the same method as declared in the parent class
or
If a child class provides the specific implementation of the method that has been declared
 by one of its parent class

2> Used to achieve runtime polymorphism
 */

class Bank{
    int getRateOfInterest(){return 0;}
}
class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}

public class MethodOverRidding {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();

        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
