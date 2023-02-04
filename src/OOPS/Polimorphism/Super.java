package OOPS.Polimorphism;

/*
super is used to refer immediate parent class object
 */

class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    void getColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.getColor();
    }
}
