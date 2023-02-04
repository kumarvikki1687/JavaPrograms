package OOPS.Polimorphism;

/*
1> can be used with variable, method, class
2> final variable   -> cannot change the value
3> final method     -> cannot override
4> final class      -> cannot extends
 */

//final variable
class Bike9 {
    final int speedlimit = 90;
    void run() {
        // speedlimit = 400;           // compile time error
    }
}

// final method
class Bike{
    final void run() {
        System.out.println("running");
    }
}

class Honda extends Bike {
    // void run() {System.out.println("running safely with 100kmph");}  // compile time error

}


final class Bike1{

}

// final class
//class Honda1 extends Bike1{
//    void run() {
//        System.out.println("running safely with 100kmph");
//    }
//}

public class Final {
    public static void main(String[] args) {

    }
}
